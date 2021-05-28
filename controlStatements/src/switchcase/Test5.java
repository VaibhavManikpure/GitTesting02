package switchcase;

import java.util.Scanner;

public class Test5 {
 public static void main(String[] args) {
	System.out.println("'main start");
	Scanner sc=new Scanner(System.in);
	System.out.println("1:  withdrwa amount");
	System.out.println("2:  Deposit amount");
	System.out.println("3: mini satatment amount");
	System.out.println("enter choice code");
	int ch=sc.nextInt();
	switch(ch){
		case 1:
		      System.out.println("money withdrwa sucessfully");
		      break;
		case 2:
			System.out.println("money deposited");
			break;
		case 3:
			System.out.println("mini statement is here");
			break;
	}
	System.out.println("main end------");
}
}
