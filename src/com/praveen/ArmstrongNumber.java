package com.praveen;
import java.util.Scanner;
public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number :");
		int n1=scan.nextInt();
		int r ,rev = 0,num;
		num=n1;
		while(n1!=0) {
			r=n1%10;
			rev=rev+r*r*r;
			n1=n1/10;	
		}System.out.println(rev);
		if(num==rev) {
			System.out.println(rev+"  is a Armstrong number");
		}else {
			System.out.println(rev+" not Armstrong number");
		}
	}

}
