package examples;

import java.util.Scanner;

public class Ex3AdditionOfNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no");
		int num=sc.nextInt();
		int rem,sum=0,count=0;
		while(num>0) {
			rem=num%10;
			sum=sum+rem;
			num=num/10;	
			count++;
		}
		System.out.println("addition  :"+sum+"   count :"+count);
				
	}

}
