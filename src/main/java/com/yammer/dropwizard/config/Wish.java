package com.yammer.dropwizard.config;

import javax.validation.constraints.NotNull;

public class Wish {
	
	@NotNull(message = ": No value for message provided.")
	private String message;

    public Wish() {
    }
    
	public Wish(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
