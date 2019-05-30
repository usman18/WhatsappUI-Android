package com.uk.whatsappui.Model;

public class Chat {
	private String image;
	private String name;
	private String lastMessage;
	private String lastMessageTime;
	
	public Chat() {
	}
	
	public Chat(String name, String lastMessage, String lastMessageTime) {
		this.name = name;
		this.lastMessage = lastMessage;
		this.lastMessageTime = lastMessageTime;
	}
	
	public Chat(String image, String name, String lastMessage, String lastMessageTime) {
		this.image = image;
		this.name = name;
		this.lastMessage = lastMessage;
		this.lastMessageTime = lastMessageTime;
	}
	
	
	
	public String getImage() {
		return image;
	}
	
	public void setImage(String image) {
		this.image = image;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getLastMessage() {
		return lastMessage;
	}
	
	public void setLastMessage(String lastMessage) {
		this.lastMessage = lastMessage;
	}
	
	public String getLastMessageTime() {
		return lastMessageTime;
	}
	
	public void setLastMessageTime(String lastMessageTime) {
		this.lastMessageTime = lastMessageTime;
	}
}
