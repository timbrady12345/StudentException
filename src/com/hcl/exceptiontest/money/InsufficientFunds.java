package com.hcl.exceptiontest.money;

public class InsufficientFunds extends Exception  {
	public InsufficientFunds() {
	}
	public String toString() {
		return "insufficient funds: cannot withdraw money exceeding account savings";
	}
}
