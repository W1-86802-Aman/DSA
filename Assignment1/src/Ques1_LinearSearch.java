
public class Ques1_LinearSearch {

	public static void main(String[] args) {
		int arr[]= {1,2,3,2};
		int value=2;
		int index=lastOccurenceOfKey(arr, value);
		if(index==-1) {
			System.out.println("value not found");
		}else {
			System.out.println("value is at index:"+index);
		}

	}
	public static int lastOccurenceOfKey(int arr[],int value) {
		for(int i=arr.length-1;i>=0;i--) {
			if(arr[i]== value) {
				return i;
			}
		}
		return -1;
	}

}
