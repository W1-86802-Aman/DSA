import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		int arr[]= {1,2,2,3,6};
		Scanner sc=new Scanner(System.in);
		int key=2;
		int n=2;
	System.out.println(nthOccurence(arr, key, n));

	}
     public static int nthOccurence(int arr[],int key,int n) {
    	 int count=0;
    	 for(int i=0;i<arr.length;i++) {
    		 if(arr[i]==key) {
    			 count++;
    		 if(count==n) {
    			 return i;
    		 }
    		 }
    	 }
    	 return -1;
     }
}
