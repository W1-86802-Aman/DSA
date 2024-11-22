import java.util.Arrays;

public class Ques1 {

	public static void main(String[] args) {
		int arr[]={34,25,37,45,22};
		for( int i=1;i<arr.length;i++) {
			int temp=arr[i];
			int j;
			for(j=i-1;j>=0;j--) {
				if(arr[j]<temp) 
					arr[j+1]=arr[j];
				else
					break;
			}
			arr[j+1]=temp;
		}
       System.out.println(Arrays.toString(arr));
	}

}
