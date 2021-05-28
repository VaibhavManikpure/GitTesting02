package examples;
import java.util.Scanner;
public class Ex7primeNoSeries 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number:");
		int mnum=sc.nextInt();
		//int count=0;
		for(int j=1;j<=mnum;j++)
		{
			int count=0;
			for(int i=1;i<=j;i++) 
			{
				if(j%i==0) 
				{
					count++;
				}
			}
			if(count==2) 
			{
				System.out.print(j+",");
				//System.out.println(j);
			}

			//else { System.out.println("not a prime no"+j); }
      
		}
	      System.out.println("This is our Ex7primeNoSeries:");
	}
}

