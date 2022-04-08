package com.aaludra.exception;

public class DuplicateException extends Exception {

	private static final long serialVersionUID = 1L;

	DuplicateException(String message) {
		super(message);
	}

}
