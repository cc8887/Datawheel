package TreeNode;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class MyStack {
/*
 *     仿照JDK中的stack编写，从jdk中可得，我们的stack有以下几个
 * 	核心功能：
 * 1、peek  主要用来获得栈顶元素，因为我们在使用的时候时常需
 * 要判断栈顶元素是否需要弹出，这时候就要对栈顶元素进行检测，因此需要
 * 2、pop 出栈必须
 * 3、push 入栈必须
 * 4、empty 外部判断空栈的入口
 * 
 * 几个工程问题：
 * 我们在实现的时候可以使用我们内部封装的容器自带的empty()的方法
 * 但这样会降低代码的可移植性，因此我们加入size属性，来辅助我们进
 * 行空栈的检测，并且在获得栈顶元素的时候也非常有利
 */  

	private ArrayList<Integer> elementData;
	private int size;
	
	public MyStack() {
		// TODO Auto-generated constructor stub
		size = 0;
		elementData = new ArrayList<>();
	}
	
	public int  pop() {
		int len = size;
		//此处有可能面临空栈的情况，所以需要进行检测
		//如果空栈抛出错误
		if(len==0) 
			throw new EmptyStackException();
		int ele = elementData.remove(len-1);
		size--;
		return ele;
	}
	
	public boolean empty() {
		return size==0;
	}
	
	public int push(int ele) {
		elementData.add(ele);
		size++;
		return ele;
	}
	
	public int peek() {
		
		int len = size;
		//此处有可能面临空栈的情况，所以需要进行检测
		//如果空栈抛出错误
		if(len==0) 
			throw new EmptyStackException();	
		return elementData.get(len-1);
	}
	
}
