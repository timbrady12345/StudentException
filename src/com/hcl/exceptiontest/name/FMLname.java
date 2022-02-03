package com.hcl.exceptiontest.name;

import java.util.Scanner;


public class FMLname {

	public static void main(String[] args) throws NameException{
		
		
		Scanner sc = new Scanner(System.in);
		FullName myName = new FullName();
		int nameLength = 0;
		
		try {
				myName.setFirstName(sc.next());
				nameLength += myName.getFirstName().length();
				myName.setMiddleName(sc.next());
				nameLength += myName.getMiddleName().length();
				myName.setLastName(sc.next());
				nameLength += myName.getLastName().length();
				if(nameLength > 15 || nameLength < 10) {
					throw new NameException();
				}
			}
		
		catch(NameException ex) {
			System.out.println(ex);
		}

		finally {
			System.out.print("Full Name: " + myName.getFirstName() + " " + myName.getMiddleName() + " " + myName.getLastName() + "\n");
			System.out.print("Name Length: " + nameLength);
			sc.close();
			}
		}
	}
