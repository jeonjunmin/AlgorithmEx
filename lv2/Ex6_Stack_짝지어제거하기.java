package lv2;

import java.util.Stack;

public class Ex6_Stack_짝지어제거하기 {	

	public static void main(String[] args) {
		
//		String s = "baabaa";
		String s = "cdcd";
		
		
		System.out.println("result===>"+solution(s));
		
		
	}
	
	public static int solution(String s) {
		int answer =-1;
		
		
		char[] strArray = s.toCharArray();
		Stack<Character> data = new Stack<>();
		
		
		for(int i = 0 ;  i < strArray.length ; i++){
			if(data.isEmpty()){
				data.push(strArray[i]);
				continue;
			}
			
			if(data.peek()!=strArray[i]){
				data.push(strArray[i]);
				continue;
			}
			
			if(data.peek()==strArray[i]){
				data.pop();
			}
			
			
		}
		
		
		if(data.isEmpty()){
			answer = 1;
		}else{
			answer = 0;
		}
		
		
        return answer;
	}
	
	

}
