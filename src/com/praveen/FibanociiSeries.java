package com.praveen;
import java.util.Scanner;
public class FibanociiSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the numbers :");
		int n1=scan.nextInt();
		int n2=scan.nextInt();
		int sum=0;
		for(int i=2;i<=10;i++) {
			sum=n1+n2;
			System.out.print(sum+" ");
			n1=n2;
			n2=sum;
		}
	}

}
