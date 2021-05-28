package examples;
import java.util.Scanner;
public class Ex5palinDromno {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int num=sc.nextInt();
		int rem;
		int sum=0;
		int temp=num;
		
		while(num>0) {
			rem=num%10;
			sum=(sum*10)+rem;
			num=num/10;	
			//System.out.print(rem);
		}
		 //System.out.println(num);
		 //System.out.println(temp);
			System.out.println("reverse no"+sum);
			if(temp==sum) {
				System.out.println("Its palinDrom no");
			}
			else {
				System.out.println(" Its not palinDrom no");
			}
			
	
		
	}
}
