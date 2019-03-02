package TreeNode;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class MyStack {
/*
 *     ����JDK�е�stack��д����jdk�пɵã����ǵ�stack�����¼���
 * 	���Ĺ��ܣ�
 * 1��peek  ��Ҫ�������ջ��Ԫ�أ���Ϊ������ʹ�õ�ʱ��ʱ����
 * Ҫ�ж�ջ��Ԫ���Ƿ���Ҫ��������ʱ���Ҫ��ջ��Ԫ�ؽ��м�⣬�����Ҫ
 * 2��pop ��ջ����
 * 3��push ��ջ����
 * 4��empty �ⲿ�жϿ�ջ�����
 * 
 * �����������⣺
 * ������ʵ�ֵ�ʱ�����ʹ�������ڲ���װ�������Դ���empty()�ķ���
 * �������ή�ʹ���Ŀ���ֲ�ԣ�������Ǽ���size���ԣ����������ǽ�
 * �п�ջ�ļ�⣬�����ڻ��ջ��Ԫ�ص�ʱ��Ҳ�ǳ�����
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
		//�˴��п������ٿ�ջ�������������Ҫ���м��
		//�����ջ�׳�����
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
		//�˴��п������ٿ�ջ�������������Ҫ���м��
		//�����ջ�׳�����
		if(len==0) 
			throw new EmptyStackException();	
		return elementData.get(len-1);
	}
	
}
