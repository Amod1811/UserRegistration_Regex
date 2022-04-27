package com.bl.UserRegistrationProblem;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
	Scanner sc = new Scanner(System.in);
	
	public void checkFirst() {
		System.out.println("Enter First name Start with capital latter");
		String firstName = sc .nextLine();
		if (Pattern.matches("[A-Z]{1}[a-z]{2}",firstName)){
			System.out.println("First Name is valid");
		}
		else {
			System.out.println("First Name is Not valid");
		}
	}
	public void checklastName(){
		System.out.println("Enter Last Name Start with capital latter");
		String LastName = sc .nextLine();
		if(Pattern.matches("[amod]{1,}[A-Z]{3}",LastName)) {
			System.out.println("Last Name is valid");
		}
		else {
			System.out.println("Last Name is not valid");
		}
	}
	public void validEmail() {
		System.out.println("Enter a Email");
		String Email = sc .next();
		if(Pattern.matches("^[a-z]{3}[.]{1}[A-Za-z0-9+_.-]*@[a-z]{2}[.]{1}[a-z]{2}[.]{1}[a-z]*$*", Email)) {
			System.out.println("Email is valid");
	}
		else {	
			System.out.println("Email is not valid");
		}
  }
	public void checkPassword() {
		System.out.println("Enter the Password");
		String password = sc.nextLine();
		if(Pattern.matches("(?=.*[A-Za-z])[A-Za-z0-9+$@_.-]{8}",password)) {
			System.out.println("password is valid");
		}
		else {
			System.out.println("password is not valid");
		}
	}
	public void upperCase() {
		System.out.println("In password present at least one Upper case alphabet");
		String Uppercase = sc.nextLine();
		if(Pattern.matches("(?=.*[A-Z]{1})[A-Za-z0-9@$_.-]{8}", Uppercase)) {
			System.out.println("Alphabet is present ");
		}
		else {
			System.out.println("Alphabet is not  present");
		}
	}
	public void numericNumber() {
		System.out.println("In password present At least one Numeric number");
		String Numeric = sc.nextLine();
		if(Pattern.matches("(?=.*[0-9]{1})[A-Za-z0-9+$@_.-]{8}", Numeric)) {
		System.out.println("Numeric Number is present");
	}
		else {
			System.out.println("Numeric Number is not present");
		}
	}
	public void specialCharacter() {
		System.out.println("In password present exact one special character");
		String Special = sc.nextLine();
		if(Pattern.matches("(?=.*[@&#]{1})[A-Za-z0-9+$@_.-]{8}", Special)) {
		System.out.println("present exact one special char");
	}
		else {
			System.out.println(" not present exact one special char");
		}
	}
	public static void main(String[] args) {
		UserRegistration ur = new UserRegistration();
		ur.checkFirst();
		ur.checklastName();
		ur.validEmail();
		ur.checkPassword();
		ur.validEmail();
		ur.upperCase();
		ur.numericNumber();
		ur.specialCharacter();
	}

}
