package com.crazytd.springstaff.config;

import com.alibaba.druid.support.http.StatViewServlet;

import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;

@WebServlet(
        urlPatterns = "/druid/*",
        initParams = {
                @WebInitParam(name = "allow", value = "127.0.0.1,192.168.0.181"),
                @WebInitParam(name = "deny", value = "192.168.1.73"),
                @WebInitParam(name = "loginUsername", value = "admin"),
                @WebInitParam(name = "loginPassword", value = "123456"),
                @WebInitParam(name = "resetEnable", value = "false") //禁用html页面reset all功能
        }
)
public class DruidStatViewServlet extends StatViewServlet {
    private static final long serialVersionUID = -2688872071445249539L;
}
