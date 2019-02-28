package Datawheel;

import java.util.ArrayList;
import java.util.Arrays;

public class MyArrayList {
	
	private static final int[] DEFAULTCAPACITY_EMPTY_ELEMENTDATA = {};
	private static final int DEFAULT_CAPACITY = 10;
	private static final int MAX_ARRAY_SIZE = Integer.MAX_VALUE - 8;
	
	private int[] elementData;
	private int size;
	private int capacity;
	public MyArrayList(int[] array) {
		// TODO Auto-generated constructor stub
		capacity = array.length;
		elementData = new int[capacity];
		System.arraycopy(array, 0, elementData, 0,capacity);
		size = elementData.length;
	}
	public MyArrayList() {
		// TODO Auto-generated constructor stub
		elementData = DEFAULTCAPACITY_EMPTY_ELEMENTDATA;
	}
    public void grow(int minCapacity) {
         elementData = Arrays.copyOf(elementData,
                                           newCapacity(minCapacity));
    }
	
    private int newCapacity(int minCapacity) {
        // overflow-conscious code
        int oldCapacity = elementData.length;
        int newCapacity = oldCapacity + (oldCapacity >> 1);
        if (newCapacity - minCapacity <= 0) {
            if (elementData == DEFAULTCAPACITY_EMPTY_ELEMENTDATA)
                return Math.max(DEFAULT_CAPACITY, minCapacity);
            if (minCapacity < 0) // overflow
                throw new OutOfMemoryError();
            return minCapacity;
        }
        return (newCapacity - MAX_ARRAY_SIZE <= 0)
            ? newCapacity
            : hugeCapacity(minCapacity);
    }
    
    private static int hugeCapacity(int minCapacity) {
        if (minCapacity < 0) // overflow
            throw new OutOfMemoryError();
        return (minCapacity > MAX_ARRAY_SIZE)
            ? Integer.MAX_VALUE
            : MAX_ARRAY_SIZE;
    }
}
