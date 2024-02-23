package com.deyvisson.todo.resources.execeptions;

import java.io.Serializable;

public class StandardError implements Serializable{


	private static final long serialVersionUID = 1L;
	
	private Long timestamp;
	private Integer statyus;
	private String message;

	public StandardError() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StandardError(Long timestamp, Integer statyus, String message) {
		super();
		this.timestamp = timestamp;
		this.statyus = statyus;
		this.message = message;
	}

	public Long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public Integer getStatyus() {
		return statyus;
	}

	public void setStatyus(Integer statyus) {
		this.statyus = statyus;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
