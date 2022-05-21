package lv1;

import java.util.Stack;

public class KB시스템_괄호짝맞추기 {

	public static void main(String[] args) {
		
		System.out.println("result===>"+solution("({}[])"));
		
		
        		
	}
	
	public static boolean solution(String s) {
        if(s.length()%2 != 0) return false;
        Stack<Character> stack = new Stack<Character>();
        for(int i =0; i<s.length(); i++) {
        	System.out.println("s.charAt(i)==>"+s.charAt(i));
            switch(s.charAt(i)) {   //주소로 스트링 표현
                case ')':
                    if(stack.peek() == '(') stack.pop();
                    break;
                case '}':
                    if(stack.peek() == '{') stack.pop();
                    break;
                case ']':
                    if(stack.peek() == '[') stack.pop();
                    break;
                default :
                    stack.push(s.charAt(i));
                    break;
            }
        }
        return stack.empty();
    }

}

