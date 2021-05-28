package examples;

public class SecondHigestNo {	public static void main(String[] args) {
	int a[]= {4,77,9,8,6};
	int temp=0;
	for(int i=0;i<a.length;i++) {
	for(int j=i+1;j<a.length;j++) {
		if(a[i]>a[j]) {
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			
		}
	}
}
	
		System.out.println("second higest Number is"+a[a.length-2]);
		
}


}
