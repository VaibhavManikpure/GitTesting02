package arrays;

public class Items {
	public static void sub(String []args) {
		System.out.println(args[0]);
		System.out.println(args[1]);
	}
	public static void main(String[] args) {
		
		  for(int i=0;i<args.length;i++) { 
			  System.out.println("Items:"+args[i]);
		  }
		 
		/*
		 * System.out.println(args[0]); System.out.println(args[1]);
		 * System.out.println(args[2]); String s[]= {"abc","def"}; sub(s);
		 */
	}

}
