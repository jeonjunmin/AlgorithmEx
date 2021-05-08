package lv3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Ex1_이분탐색_입국심사 {
	static class People {
        int maxtime;
        int movetime;
        int peoplenum;

        public People(int maxtime) {
            this.maxtime = maxtime;
            this.movetime = 0;
            this.peoplenum = 0;
        }
        
        public void moving() {
        	movetime--;            
        }
        
        public void keep() {
        	this.movetime = this.maxtime;
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int n = 6;
//		int[] time = {7, 10 ,14};
		
		int n = 6;
		int[] time = {7, 10 };
		
//		int n = 3;
//		int[] time = {1000000000, 1000000000,1000000000};
		
		System.out.println("result ==> "+ solution(n, time));
		

	}
	
	
	public static long solution(int n,  int[] times) {
		long answer = 0;
        
//        Queue<People> simpeople = new LinkedList<>(); //지나가지 않은 것
        List<People> simpeople = new ArrayList<People>();
        Queue<Integer> waitpeople = new LinkedList<>(); //다리위에 지나가는 중
        
        for(int a :times ){
        	simpeople.add(new People(a));
        }
        
        for(int i = 1 ; i <= n ; i++){
        	waitpeople.add(i);
        }
        
        
        while(true){
        	System.out.println(waitpeople.isEmpty()+"   "+simpeople.get(0).movetime+"   "+simpeople.get(1).movetime+"       "+simpeople.get(1).movetime+"   "+answer+"        "+waitpeople.peek());
        	for(People a : simpeople){
        		if(waitpeople.peek()==null&&a.movetime==0){
        			continue;
        		}
        		if(a.movetime == 0){
        			waitpeople.poll();
    				a.keep();
        			a.moving();
        		}
        		else{
        			a.moving();
        		}
        	}
        	
        	int cnt = 0;
        	for(People a : simpeople){
        		if(a.movetime==0){
        			cnt++;
        		}
        	}
        	
        	if(cnt ==times.length && waitpeople.isEmpty()==true){
        		break;
        	}
        	
        	answer++;
        }
        
        
        return answer;
    }

}
