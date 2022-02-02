package com.hcl.exceptiontest;
public class  MyException2 extends Exception  {
		public MyException2() {
		}
		public String toString() {
			return "MyException2 Object : marks cannot be < 0 or > 100 " ;
		}
	}
