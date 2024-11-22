
public class Ques5 {

	public static void main(String[] args) {
		//palindrome
		int num=121;
		int temp=num;
		int rev=0;
		while(temp>0) {
			int rem=temp%10;
			rev=rem+rev*10;
			temp=temp/10;
		}
		if(num==rev) {
			System.out.println("it is palindrome");
		}else {
			System.out.println("not a palindrome");
		}
		

	}

}
