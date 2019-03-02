package Datawheel;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class MyClcQueue {
	private int size;
	private int[] elementData;
	//int MAX_LENGTH;
	private int front;
	private int fore;
	private static final int MAX_LENGTH = 10;
	public MyClcQueue() {
		// TODO Auto-generated constructor stub
		 elementData = new int[MAX_LENGTH];
		 front = 0;
		 fore = 0;
	}
	public boolean isEmpty() {
		return fore==front;
	}
	
	public int peek() {
		if (isEmpty()) throw new EmptyStackException();
		return elementData[front];
	}
	
	public int offer(int num) {
		if ( (fore>front && fore-front==MAX_LENGTH) || (fore<front && front-fore==1)) 
			throw new StackOverflowError();
		if (fore==MAX_LENGTH-1) fore = 0;
		else fore++;
		elementData[fore] = num;
		return num;
	}
	public int pop() {
		if (isEmpty()) throw new EmptyStackException();
		int num = elementData[front];
		if (front==MAX_LENGTH-1) front = 0;
		else front--;
		return num;
	}
}
