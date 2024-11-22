import java.util.Arrays;

class Stack{
	int arr[];
	final int SIZE;
    int top;
	
	public Stack(int size) {
		SIZE=size;
		arr=new int[SIZE];
		top=SIZE-1;
	}
	public void push(int value) {
		top--;
		arr[top]=value;
	}
	public int pop() {
		int temp=arr[top];
		top++;
		return temp;
	}
	public int peek() {
		return arr[top];
	}
	public boolean isEmpty() {
		return top==SIZE-1;
	}
	public boolean isFull() {
		return top==-1;
	}
	@Override
	public String toString() {
		return "Stack [arr=" + Arrays.toString(arr) ;
	}
	
}
public class Ques3 {

	public static void main(String[] args) {
		Stack st= new Stack(4);
		st.push(10);
		st.push(20);
		st.push(30);
		System.out.println(st.toString());
		int r=st.pop();
		System.out.println(r);
		int s=st.SIZE;
		System.out.println(s);
	}

}
