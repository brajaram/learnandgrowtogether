public class StackImpl {
	
	private int[] stackStruct;
	private int idx;
	private int size;
	
	public StackImpl(int n){
		size = n;
		stackStruct = new int[size];
		idx = -1;
	}
	
	public void push(int element){
		if (idx < size){
			stackStruct[++idx] = element;
		}
		else{
			System.out.println("Stack is full");
		}
	}
	
	public int pop(){
		if(isEmpty()){
			System.out.println("Stack is empty, cannot pop anything");
			throw new ArrayIndexOutOfBoundsException(); 
		}
		else{
			return stackStruct[idx--]; 
		}
	}
	
	
	public int peek(){
		if(isEmpty()){
			System.out.println("Statck is empty, cannot peek anything");
			throw new ArrayIndexOutOfBoundsException(); 
		}
		else{
			return stackStruct[idx];
		}		
	}
	
	public int size(){
		return idx+1;
	}
	
	public boolean isEmpty(){
		if(idx == -1){
			return true;
		}
		else{
			return false;
		}
	}
	
	public static void main(String args[]){
		StackImpl obj = new StackImpl(5);
		String str = "hello";
		
		
		obj.push(1);
		obj.push(3);
		System.out.println("size of stack: " + obj.size());
		System.out.println("popped element" + obj.pop());
		obj.push(5);
		System.out.println("peek element: " + obj.peek());
		System.out.println("popped element" + obj.pop());
		System.out.println("popped element" + obj.pop());
		System.out.println("popped element" + obj.pop());
	}
	
}
