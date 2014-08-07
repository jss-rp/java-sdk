package com.konduto.sdk.exceptions;

/**
 * Created by rsampaio on 01/08/14.
 */
public abstract class KondutoHTTPException extends KondutoException {
	private String message;

	protected KondutoHTTPException(String message, String responseBody){
		this.message = String.format("%s - Response body: %s", message, responseBody);
	}

	@Override
	public String getMessage() { return this.message; }
}
