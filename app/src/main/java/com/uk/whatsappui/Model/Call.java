package com.uk.whatsappui.Model;

public class Call {
	
	private String profilePic;
	private String name;
	private String time;
	private int type;
	
	public static final int AUDIO = 0;
	public static final int VIDEO = 1;
	
	public Call(String profilePic, String name, String time, int type) {
		this.profilePic = profilePic;
		this.name = name;
		this.time = time;
		this.type = type;
	}
	
	public Call(String name, String time, int type) {
		this.name = name;
		this.time = time;
		this.type = type;
	}
	
	public String getProfilePic() {
		return profilePic;
	}
	
	public void setProfilePic(String profilePic) {
		this.profilePic = profilePic;
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
	
	public int getType() {
		return type;
	}
	
	public void setType(int type) {
		this.type = type;
	}
}
