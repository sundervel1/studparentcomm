package com.cg.exception;

public class StudentIDNotFoundException extends RuntimeException {
	public StudentIDNotFoundException(String msg) {
		super(msg);
	}
}
