package com.praveen;
import java.util.Scanner;
public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the number :");
	int num=scan.nextInt();
	int n=num;
	int rev =(Integer) null;
	while(num!=0) {
		rev=rev*10+num%10;
		num=num/10;
	}System.out.println("Reverse number :"+rev);
	if(n==rev) {
		System.out.println(rev+" Palindrome number");
	}else {
		System.out.println(rev+"Not a Palindrome number");
	}
	}
}
