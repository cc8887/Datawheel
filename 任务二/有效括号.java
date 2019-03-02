package TreeNode;

import java.util.Stack;

//import com.sun.tools.classfile.StackMap_attribute.stack_map_frame;

public class Test20 {
	public static void main(String[] arg) {
		String string = "{";
		System.out.println(isValid(string));
	}
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] array = s.toCharArray();
        for (int i = 0; i < array.length; i++) {
			if(array[i]==']'||array[i]==')'||array[i]=='}')
			{
			//	System.out.println(array[i]);
				if (stack.isEmpty() || Math.abs(array[i]-stack.pop()) > 2) return false;
			}
			else 
				stack.push(array[i]);
		}
        if (stack.isEmpty()) return true;
    	else return false;
    }
}
