package com.praveen;
import java.util.Scanner;
public class CountEvenodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number :");
		int n=scan.nextInt();
		if(n%2==0) {
			System.out.println(n+" is a even number");
		}else {
			System.out.println(n+" is a odd number");
		}
		
	}

}
