
public class Q6 {

	public static void main(String[] args) {
		int arr[]={ 1, 2, 3, -1, 2, 1, 0, 4, -1, 7, 8 } ;
		
		for(int i=0;i<arr.length;i++) {
			int x=arr[i];
			int count=0;
			for(int j=0;j<arr.length;j++) {
				if(arr[j]==x) {
					count++;
				}
			}
			if(count==1) {
				System.out.println(arr[i]);
			}
		}

	}

}
