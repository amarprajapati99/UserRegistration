package com.userregistraction.bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("enter your first name");
		String firstName = scanner.nextLine();

		Pattern pattern = Pattern.compile("[A-Z]{1}[a-z]{2}+");
		Matcher matcher = pattern.matcher(firstName);
		boolean matches = matcher.find();
		if (matches)
			System.out.println("your first name is valid");
		else if (firstName.length() <= 3)
			System.out.println("enter max 4 character");
		else
			System.out.println("your  last name is invalid");
		System.out.println("enter your last name");
		
		
		String lastName = scanner.nextLine();
		if (matches)
			System.out.println("your name is valid");
		else if (lastName.length() <= 3)
			System.out.println("enter max 4 character");
		else
			System.out.println("your name is invalid");

		System.out.println("enter your email");
		String emailId = scanner.nextLine();
		pattern = Pattern.compile(
				"^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$",
				Pattern.CASE_INSENSITIVE);
		matcher = pattern.matcher(emailId);
		matches = matcher.find();
		if (matches)
			System.out.println("your email id  is valid");
		else
			System.out.println("please enter a valid email");
		
		System.out.println("enter your mobile number");
		CharSequence mobileNumber = scanner.next();
		pattern = Pattern.compile("^((\\+)?(\\d{2}[-]))?(\\d{10}){1}?$",Pattern.CASE_INSENSITIVE);
		matcher = pattern.matcher(mobileNumber);
		matches = matcher.find();
		if (matches)
			System.out.println("your mobile number is valid");
		else
			System.out.println("please enter a valid mobile number");
		
		System.out.println("enter your password");
		String pass = scanner.next();
		pattern = Pattern.compile("^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{8,}$",Pattern.CASE_INSENSITIVE);
		matcher = pattern.matcher(pass);
		matches = matcher.find();
		if(matches)
			System.out.println("password is valid");
		else
			System.out.println("please enter your valid password");
		
		

	}

}
