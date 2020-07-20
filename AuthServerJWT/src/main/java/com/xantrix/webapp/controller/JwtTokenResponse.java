package com.xantrix.webapp.controller;

import java.io.Serializable;

import lombok.Data;

@Data
public class JwtTokenResponse implements Serializable 
{

	public JwtTokenResponse(String refreshedToken) {
		this.token = refreshedToken;
	}

	private static final long serialVersionUID = 8317676219297719109L;

	private final String token;

}