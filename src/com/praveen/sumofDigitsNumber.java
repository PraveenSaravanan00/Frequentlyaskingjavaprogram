package com.praveen;
import java.util.Scanner;
public class sumofDigitsNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number :");
		int n=scan.nextInt();
		int sum=0;
		while(n!=0) {
			sum=sum+n%10;
			n/=10;
		}System.out.println("Sum of digits :"+sum);
	}

}
