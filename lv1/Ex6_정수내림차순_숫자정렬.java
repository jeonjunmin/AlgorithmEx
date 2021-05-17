package lv1;

import java.util.Arrays;

public class Ex6_정수내림차순_숫자정렬 {
	

	public static void main(String[] args) {
		long n = 118372;
		
		System.out.println("result ==> "+ solution(n));

	}
	
	private static long solution(long n) {
		long answer = 0;
		
		String s = Long.toString(n);
		char[] strArray = s.toCharArray();
		Arrays.sort(strArray);  //오름차순 정렬
		
		StringBuilder sss = new StringBuilder(String.valueOf(strArray));
		
		
		
		answer = Long.parseLong(sss.reverse().toString()); //오름차순으로 된거 뒤집기
		
		System.out.println(answer);

		
		return answer;
	
    }
	

}
