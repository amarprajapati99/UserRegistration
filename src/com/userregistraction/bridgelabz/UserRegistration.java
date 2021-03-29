package com.userregistraction.bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("enter your first name");
		String firstName = scanner.next();
		Pattern pattern = Pattern.compile("[A-Z]{1}[a-z]{2}+");
		Matcher matcher = pattern.matcher(firstName);
		boolean matches = matcher.find();
		if (matches)
			System.out.println("your name is valid");
		else if(firstName.length()<=3)
			System.out.println("enter max 4 character");
		else
			System.out.println("your name is invalid");
	}

}
