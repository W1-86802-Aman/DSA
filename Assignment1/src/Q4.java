

import java.util.Scanner;

public class Q4 {
   public static void main(String[] args) {
	int arr[]= {99,88,77};
	Scanner sc= new Scanner(System.in);
	System.out.println("enter the number");
	int key=sc.nextInt();
	int index=binarySearch(arr, key);
	if(index==-1) {
		System.out.println("key not found");
	}else {
		System.out.println("key found at:"+index);
	}
	
}
   public static int binarySearch(int arr[],int key) {
	 int start=0,end=arr.length-1,mid;
	 
	 while(start<=end) {
		 mid=(start+end)/2;
		 if(key == arr[mid]) {
			 return mid;
		 }
		 if(key <arr[mid]) {
			 start=mid+1;
			
		 }else {
			 end=mid-1;
		 }
	 }
	 return -1;
   }
}
