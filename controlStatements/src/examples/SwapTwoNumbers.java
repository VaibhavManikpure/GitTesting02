package examples;

public class SwapTwoNumbers {
	public static void main(String[] args) {
		int x=10;
		int y=20;
		int swap=0;
		System.out.println("x value before swap:"+x);
		System.out.println("Y vaue before swap:"+y);
		swap=x;
		x=y;
		y=swap;
		System.out.println("x value After swap:"+x);
		System.out.println("Y vaue After swap:"+y);
	}

}
