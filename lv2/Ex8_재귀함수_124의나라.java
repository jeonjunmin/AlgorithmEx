package lv2;

import java.util.HashMap;

public class Ex8_재귀함수_124의나라 {
	static int ans, goal, n, num[], cache[];

	public static void main(String[] args) {
		
		int n = 11;
		
		
		System.out.println("result===>"+solution(n));
		
		
	}
	
	public static String solution(int n) {
		String answer = "";
		
		String [] temp = {"4","1","2"}; 
		
		
		while(n > 0){
			System.out.println("n==>>"+n);
			System.out.println(n%3);
//			System.out.println(i/3);
//			System.out.println("!!"+a[i%3]);
			
			int remainder = n % 3 ;
			n /= 3;
			
			if(remainder == 0){
				n--;
			}
			
			answer = temp[remainder] + answer;
			
		}
		
//		String [] a = {"1","2","4"}; 
//		System.out.println("===========================================");
//		answer = a[0];
//		System.out.println(answer);
//		answer = a[1];
//		System.out.println(answer);
//		answer = a[2];
//		System.out.println(answer);
//		////////////////////////////////////////////
//		answer = a[0];
//		answer += a[0];
//		System.out.println(answer);
//		answer = a[0];
//		answer += a[1];
//		System.out.println(answer);
//		answer = a[0];
//		answer += a[2];
//		System.out.println(answer);
//		
//		answer = a[1];
//		answer += a[0];
//		System.out.println(answer);
//		answer = a[1];
//		answer += a[1];
//		System.out.println(answer);
//		answer = a[1];
//		answer += a[2];
//		System.out.println(answer);
//		
//		answer = a[2];
//		answer += a[0];
//		System.out.println(answer);
//		answer = a[2];
//		answer += a[1];
//		System.out.println(answer);
//		answer = a[2];
//		answer += a[2];
//		System.out.println(answer);
//		///////////////////////////////////////////////////////
//		answer = a[0];
//		answer += a[0];
//		answer += a[0];
//		System.out.println(answer);
//		answer = a[0];
//		answer += a[0];
//		answer += a[1];
//		System.out.println(answer);
//		answer = a[0];
//		answer += a[0];
//		answer += a[2];
//		System.out.println(answer);
//		
//		answer = a[0];
//		answer += a[1];
//		answer += a[0];
//		System.out.println(answer);
//		answer = a[0];
//		answer += a[1];
//		answer += a[1];
//		System.out.println(answer);
//		answer = a[0];
//		answer += a[1];
//		answer += a[2];
//		System.out.println(answer);
		
		
		
		
		
		
		
        return answer;
	}
	
	
	
	

}
