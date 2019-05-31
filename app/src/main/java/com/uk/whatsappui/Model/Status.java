package com.uk.whatsappui.Model;

public class Status {
	private String imageUrl;
	private String name;
	private String time;
	
	public Status(String imageUrl, String name, String time) {
		this.imageUrl = imageUrl;
		this.name = name;
		this.time = time;
	}
	
	public Status(String name, String time) {
		this.name = name;
		this.time = time;
	}
	
	public String getImageUrl() {
		return imageUrl;
	}
	
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getTime() {
		return time;
	}
	
	public void setTime(String time) {
		this.time = time;
	}
}
