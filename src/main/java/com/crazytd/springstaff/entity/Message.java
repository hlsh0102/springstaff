package com.crazytd.springstaff.entity;

import lombok.Data;

@Data
public class Message {
	private String title;
	private String content;
	private String extra;

	public Message(String title, String content, String extra) {
		this.title = title;
		this.content = content;
		this.extra = extra;
	}
}
