package com.capg.regex1;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class pincodeValdation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a pincode: ");
		String pincode = sc.nextLine();
		Pattern pattern =Pattern.compile("^[1-9]{1}[0-9]{5}$");
		Matcher matcher = pattern.matcher(pincode);
		boolean matchfound = matcher.find();
		if(matchfound) {
			System.out.println("Match found");
		}
		else {
			System.out.println("Match not found");
		}
	}

}
