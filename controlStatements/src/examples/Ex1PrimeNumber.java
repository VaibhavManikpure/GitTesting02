package examples;

import java.util.Scanner;

public class Ex1PrimeNumber {//no which is divisible by itself of 1 only
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number:");
		
		int num=sc.nextInt();
		int count=0;
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println("Number is prime:"+num);
		}
		else {
			System.out.println("not a prime no:"+num);
		}
	}

}
