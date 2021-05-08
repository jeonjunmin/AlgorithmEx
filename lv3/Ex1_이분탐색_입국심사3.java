package lv3;

import java.util.Arrays;

public class Ex1_이분탐색_입국심사3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int n = 6;
		int[] time = {7, 10 };
		
		
		System.out.println("result ==> "+ solution(n, time));
		

	}
	
	
	public static long solution(int n,  int[] times) {
		long answer = 0;
		int mid_time;
		int sum;
		Arrays.sort(times);
		
		int min_time = 1;
		int max_time = times[times.length -1] * n;
		answer = max_time;
		
		
		while(min_time <= max_time){
			mid_time = (min_time+max_time)/2;

	        sum = 0;
	        for (int i=0 ; i < times.length ; i++){
	        	sum += mid_time/times[i];
	        }
	        
	        if(sum >= n){
	        	if(answer > mid_time){
	        		answer = mid_time;
	        	}			                
	            max_time = mid_time - 1;
	        }else{
	        	min_time = mid_time + 1;
	        }
		}

		return answer;
    }
}
