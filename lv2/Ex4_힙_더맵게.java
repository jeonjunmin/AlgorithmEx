package lv2;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Ex4_힙_더맵게 {
	static int ans, goal, n, num[], cache[];

	public static void main(String[] args) {
		
//		int[] scoville = {12, 2, 3, 9, 1, 10};
		int[] scoville = {1, 1};
		int K = 7;
		
		
		System.out.println("result===>"+solution(scoville,K));
		
		
	}
	
	public static int solution(int[] scoville, int K) {
		int answer = 0;
        List<Integer> tempArr = new ArrayList<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>();  //우선순위로 정렬해서 순서대로 숫자를 뽑아준다.
        for(int a : scoville){
        	pq.add(a);     
        }
        
        
        while(pq.peek() < K){
        	if(pq.size()<2&&pq.peek()<K){
        		answer = -1;
        		break;
        	}
        	
        	int a =pq.poll();
        	int b =pq.poll();
        	pq.add(a+b*2);
        	answer++;
          
        }
        
        return answer;
	}
	
	

}
