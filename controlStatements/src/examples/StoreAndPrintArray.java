package examples;

import java.util.Scanner;

public class StoreAndPrintArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of Element:");
		int size=sc.nextInt();
		int x[]=new int[size];
		System.out.println("Length:"+x.length);// Lenght of array
		for(int i=0;i<size;i++) {
			System.out.println("Enter no:");
			x[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++) {
			System.out.print(" "+x[i]); 
		}
			
		}
				
	}


