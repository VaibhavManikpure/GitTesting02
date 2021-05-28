package examples;

import java.util.Scanner;

public class TwoArrayMergeNew {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("how many no of data you want to enter in first array:");
		int x[]=new int [s.nextInt()];
		for (int i=0;i<x.length;i++) {
			System.out.println("enter no of data");
			x[i]=s.nextInt();
			
		}
	
		System.out.println("how many no of data you want to enter in second array:");
		int y[]=new int [s.nextInt()];
		for (int i=0;i<y.length;i++) {
			System.out.println("enter no of data");
			y[i]=s.nextInt();
		}
		int size=x.length+y.length;
		int c[]=new int [size];
		
		for(int i=0;i<x.length;i++) {
			c[i]=x[i];
		}
		for(int i=0;i<y.length;i++) {
			c[i+x.length]=y[i];
		}
		for (int i=0;i<c.length;i++) {
			System.out.println("  "+c[i]);
		}
	}
	
}
