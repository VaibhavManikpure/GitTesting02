package dowhileloop;

import java.util.Scanner;

public class Test5 {
	public static void main(String[] args) {
		System.out.println("main start");
		Scanner s=new Scanner(System.in);
		int n=0;
		int count=0;
		do {
			System.out.println("enter no");
			n=s.nextInt();
			count++;
		}
		while(n>0);
		System.out.println("while loop exicuted  "+count+"  times");
		System.out.println("main -----end"); 	 
	}

}
