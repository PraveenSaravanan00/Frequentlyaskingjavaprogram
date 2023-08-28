package com.praveen;

import java.util.Scanner;

public class PAlindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the word :");
		String a=scan.nextLine();
		String rev="";
		for(int i=a.length()-1;i>=0;i--) {
			rev=rev+a.charAt(i);
		}System.out.println(rev);
		if(rev.equals(a)) {
			System.out.println("Palindrome String :"+rev);
		}else {
			System.out.println("Not Palindrome String :"+rev);
		}
	}

}
