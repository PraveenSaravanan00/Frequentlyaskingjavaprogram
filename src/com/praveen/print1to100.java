package com.praveen;
import java.util.Scanner;
public class print1to100 {
	public static void printnumbers(int num) {
		
		if(num<=100) {
			System.out.print(num+" ");
			printnumbers(num+1);
	}}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		//int i=s.nextInt();
		printnumbers(num);
	}

}
