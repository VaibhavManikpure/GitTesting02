package examples;

import java.util.Scanner;

public class OccuranceCountInArray1 {
	 public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.println("enter no for element:");
         int size=sc.nextInt();
         int x[]=new int[size];
         int temp=0;
         int count=0;
         for(int i=0;i<size;i++) {
       	  System.out.println("enter no:");
       	  x[i]=sc.nextInt();
         }
         System.out.println("database no");
         for(int i=0;i<size;i++) {
        	 System.out.println("  "+x[i]);
         }
         System.out.println("Enter no which you want yo check:");
         int en=sc.nextInt();
         for(int i=0;i<size;i++) {
       	  //for(int j=i+1;j<size;j++) {
       	  if(en==x[i]) {
       		  temp=x[i];
       		  count++;
       	  //}
       	  }
         }
         System.out.println(" Occurance of" +temp+" :"+count+" Times");
  }

}
