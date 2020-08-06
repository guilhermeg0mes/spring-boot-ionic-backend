package com.guilherme.cursomc.resources.exceptions;

import java.io.Serializable;

import org.springframework.http.HttpStatus;

public class StandardError implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private HttpStatus status;
	private String msg;
	private long timeStamp;
	public StandardError(HttpStatus notFound, String msg, long timeStamp) {
		super();
		this.status = notFound;
		this.msg = msg;
		this.timeStamp = timeStamp;
	}
	public HttpStatus getStatus() {
		return status;
	}
	public void setStatus(HttpStatus status) {
		this.status = status;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public long getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(long timeStamp) {
		this.timeStamp = timeStamp;
	}
	
}
