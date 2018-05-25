package com.crazytd.springstaff.websocket;

import lombok.extern.slf4j.Slf4j;

import javax.websocket.*;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArraySet;

@Slf4j
@ServerEndpoint(value = "/webSocket")
public class WebSocketServer {

	//静态变量，用来记录当前连接数，线程安全
	private static int onlineCount = 0;

	//线程安全的arraySet
	private static CopyOnWriteArraySet<WebSocketServer> webSocketSet = new CopyOnWriteArraySet<>();

	//与某个客户端的连接会话
	private Session session;

	/**连接建立成功时调用**/
	@OnOpen
	public void onOpen(Session session){
		this.session =session;
		webSocketSet.add(this);
		addOnlineCount();
		log.info("有新的连接加入，总数="+getOnlineCount());
	}


	@OnClose
	public void onClose(){
		webSocketSet.remove(this);
		subOnlineCount();
		log.info("有人退出连接,总数="+getOnlineCount());
	}

	/** 收到客户端信息之后调用的方法*/
	@OnMessage
	public void onMessage(String message,Session session){
		log.info("来自客户端的信息"+message);
		/*群发消息*/
		for (WebSocketServer webSocketServer : webSocketSet) {
			try {
				webSocketServer.sendMessage(message);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	@OnError
	public void onError(Throwable throwable){
		log.info("发生错误");
		throwable.printStackTrace();
	}




	public void sendMessage(String message) throws IOException {
		this.session.getBasicRemote().sendText(message);
	}

	public static synchronized int getOnlineCount() {
		return onlineCount;
	}

	public static synchronized void addOnlineCount() {
		WebSocketServer.onlineCount++;
	}

	public static synchronized void subOnlineCount() {
		WebSocketServer.onlineCount--;
	}
}
