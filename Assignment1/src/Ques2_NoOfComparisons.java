import java.util.Scanner;

public class Ques2_NoOfComparisons {

	public static void main(String[] args) {
		int arr[]= {11,22,33,44,55,66,77,88};
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number");
		int key=sc.nextInt();
//		int index=linearSearch(arr, key);
		int index=binarySearch(arr, key);
		if(index==-1) {
			System.out.println("key not found");
		}else {
			System.out.println("key found at index:"+index);
		}
		
	}
//	public static int linearSearch(int arr[],int key) {
//		int count=0;
//		for(int i=0;i<arr.length;i++) {
//			count++;
//			if(arr[i]==key) {
//				System.out.println("loop iterated:"+count+" times");
//				return i;
//			}
//		}
//		return -1;
//	}
	public static int binarySearch(int arr[],int key) {
		int start=0;
		int end=arr.length-1;
		int mid;
		int count=0;
		while(start<=end) {
			count++;
			mid=start+end/2;
			if(key==arr[mid]) {
				System.out.println("loop iterated:"+count+" times");
				return mid;
			}
			if(key<arr[mid]) {
				end=mid-1;
			}else {
				start=mid+1;
			}
		}
		return -1;
	}

}
