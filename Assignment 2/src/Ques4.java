import java.util.Arrays;

class Stack2{
	int arr[];
	int SIZE;
	int top;
	
	public Stack2(int size) {
		SIZE=size;
		arr= new int[SIZE];
		top=-1;
	}
	public void push(int value) {
		top++;
		arr[top]=value;
	}
	public int pop() {
		int temp=arr[top];
		top--;
		return temp;
	}
	public int peek() {
		return arr[top];
	}
	public boolean isEmpty() {
		return top==-1;
	}
	public boolean isFull() {
		return top==SIZE-1;
	}
	@Override
	public String toString() {
		return "Stack2 [arr=" + Arrays.toString(arr);
	}
	
}
public class Ques4 {

	public static void main(String[] args) {
		Stack2 st=new Stack2(4);
		for(int i=st.SIZE-1;i>=0;i--) {
			System.out.println(i);
		}
		

	}

}
