package com.ecommerce.test;

import java.util.Date;

public class ExceptionResponse {
	private Date timeStamps;
	private String message;
	private String details;
	public Date getTimeStamps() {
		return timeStamps;
	}
	public void setTimeStamps(Date timeStamps) {
		this.timeStamps = timeStamps;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public ExceptionResponse(Date timeStamps, String message, String details) {
		super();
		this.timeStamps = timeStamps;
		this.message = message;
		this.details = details;
	}

	
}
