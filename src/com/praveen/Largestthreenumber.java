package com.praveen;
import java.util.Scanner;
public class Largestthreenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the numbers :");
		int n1=scan.nextInt();
		int n2=scan.nextInt();
		int n3=scan.nextInt();
		int l=(n1>n2?n1:n2)>n3?(n1>n2?n1:n2):n3;//Tenary OPerator
		System.out.println(l);
	}

}
