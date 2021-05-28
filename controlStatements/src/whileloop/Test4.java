package whileloop;

import java.util.Scanner;

public class Test4 {
	public static void main(String[] args) {
		System.out.println("main --start");
		Scanner s=new Scanner(System.in);
		int n=1;
		int count=0;
		while(n>0) {
			System.out.println("enter no");
			n=s.nextInt();
			count++;
		}
		System.out.println("while loop exicuted  "+count+"  times");
		System.out.println("main -----end");
	}

}
