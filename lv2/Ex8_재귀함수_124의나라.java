package lv2;

import java.util.HashMap;

public class Ex8_재귀함수_124의나라 {
	static int ans, goal, n, num[], cache[];

	public static void main(String[] args) {
		
		int n = 4;
		
		
		System.out.println("result===>"+solution(n));
		
		
	}
	
	public static String solution(int n) {
		String answer = "";
		
		String [] a = {"1","2","4"}; 
		
		int i =3;
		int pow = 1;
		while(true){
			pow++;
			i*=3;
			if(i>n){
				System.out.println("n:"+n+"   i:"+i+"   pow:"+pow);
				break;
			}
				
		};
		
		
		for(int j = 0 ; j < pow ; j++){
			answer = a[j];
			for(String b : a){
				answer+=b;
			}
		}
		
		
		
		
		
		answer = a[0];
		System.out.println(answer);
		answer = a[1];
		System.out.println(answer);
		answer = a[2];
		System.out.println(answer);
		////////////////////////////////////////////
		answer = a[0];
		answer += a[0];
		System.out.println(answer);
		answer = a[0];
		answer += a[1];
		System.out.println(answer);
		answer = a[0];
		answer += a[2];
		System.out.println(answer);
		
		answer = a[1];
		answer += a[0];
		System.out.println(answer);
		answer = a[1];
		answer += a[1];
		System.out.println(answer);
		answer = a[1];
		answer += a[2];
		System.out.println(answer);
		
		answer = a[2];
		answer += a[0];
		System.out.println(answer);
		answer = a[2];
		answer += a[1];
		System.out.println(answer);
		answer = a[2];
		answer += a[2];
		System.out.println(answer);
		///////////////////////////////////////////////////////
		answer = a[0];
		answer += a[0];
		answer += a[0];
		System.out.println(answer);
		answer = a[0];
		answer += a[0];
		answer += a[1];
		System.out.println(answer);
		answer = a[0];
		answer += a[0];
		answer += a[2];
		System.out.println(answer);
		
		answer = a[0];
		answer += a[1];
		answer += a[0];
		System.out.println(answer);
		answer = a[0];
		answer += a[1];
		answer += a[1];
		System.out.println(answer);
		answer = a[0];
		answer += a[1];
		answer += a[2];
		System.out.println(answer);
		
		
		
		
		
		
		
        return answer;
	}
	
	
	
	

}
