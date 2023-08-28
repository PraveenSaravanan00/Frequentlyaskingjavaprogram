package com.praveen;
import java.util.Scanner;
public class Reversenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner scan=new Scanner(System.in);	
	System.out.println("Enter the  number :");
	int num=scan.nextInt();
	int rev=0;
	while(num!=0) {
		rev=rev*10+num%10;
		num=num/10;
	}
	System.out.println("Reverse number :"+rev);
	}

}
