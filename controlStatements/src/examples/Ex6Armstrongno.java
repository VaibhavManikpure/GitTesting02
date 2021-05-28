package examples;

import java.util.Scanner;

public class Ex6Armstrongno {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		int rem;
		int sum = 0;
		int temp = num;

		while (num > 0) {
			rem = num % 10;
			sum = sum + (rem * rem * rem);
			num = num / 10;
			// System.out.print(rem);
		}
		//System.out.println(num);
		// System.out.println(temp);
		System.out.println(sum);
		if (temp == sum) {
			System.out.println("Its Armstrong no");
		} else {
			System.out.println(" Its not Armstrong no");
		}

	}

}
