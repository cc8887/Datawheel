package TreeNode;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.Queue;

public class MyQueue {
	private int size;
	private ArrayList<Integer> elementData;
	
	
	public MyQueue() {
	// TODO Auto-generated constructor stub
		size = 0;
		elementData = new ArrayList<>();
	}
	public void add(int num) {
		elementData.add(num);
//		return true;
	}
	
	public int peek() {
		//为什么queue里如果队列为空不需要报错？
//		return size==0? null: elementData.get(0);
		if (size==0) 
			throw new EmptyStackException();
		return elementData.get(0);
	}
	
	public int poll() {
		if (size==0) 
			throw new EmptyStackException();
		return elementData.remove(--size-1);
	}
	
	
	
	
}
