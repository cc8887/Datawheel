package Datawheel;

public class MySetLenArr {
	private static final int[] DEFAULTCAPACITY_EMPTY_ELEMENTDATA = {};
	
	private int[] elementData;
	private int size;
	private int capability;
	//private int
	
	
	public MySetLenArr(int[] array) {
		// TODO Auto-generated constructor stub

		size = array.length;
		elementData = new int[size];
		System.arraycopy(array, 0, elementData, 0, size);
		capability = elementData.length;
	}
	
	public MySetLenArr(int s) {
		// TODO Auto-generated constructor stub
		size = 0;
		capability = s;
		elementData = new int [s];
	}
	
	public MySetLenArr() {
		// TODO Auto-generated constructor stub
		size = 0;
		elementData = DEFAULTCAPACITY_EMPTY_ELEMENTDATA;
	}
	
	public boolean insert(int index, int num) {
		if (index >= size || index < 0 || size == capability) return false;
        System.arraycopy(elementData, index,
                elementData, index + 1,
                size - index);
        elementData[index] = num;
        size++;
		return true;
	}
	public boolean remove(int index) {
		if (index >= size || index < 0||size == 0) return false;
		if (size-index-1>0) 
			System.arraycopy(elementData, index + 1,elementData, index,size - index - 1);
		elementData[--size] = 0;
		return true;
	}
	public boolean set(int index, int num) {
		if (index >= size || index < 0) return false;
		elementData[index] = num;
		return true;
	}
	
}
