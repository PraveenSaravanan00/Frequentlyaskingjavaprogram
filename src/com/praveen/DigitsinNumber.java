package com.praveen;
import java.util.Scanner;
public class DigitsinNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number :");
		int num=scan.nextInt();
		int count=0;
		while(num!=0) {
			num=num/10;
			count++;
		}System.out.println("Number of digits in the number :"+count);
	}

}
