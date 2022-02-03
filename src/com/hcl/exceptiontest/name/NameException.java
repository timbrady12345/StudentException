package com.hcl.exceptiontest.name;

public class NameException extends Exception{
	public NameException() {
	}
	public String toString() {
		return "NameException: Name must be < 10 or > 15 characters";
	}
}