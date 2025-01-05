package com.akash.restApi.helloworld;

public class HellworldBean {

	private String message;

	public HellworldBean(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "HellworldBean [message=" + message + "]";
	}
}
