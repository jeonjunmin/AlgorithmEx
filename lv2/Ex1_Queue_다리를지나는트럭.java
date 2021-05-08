package lv2;

import java.util.LinkedList;
import java.util.Queue;

public class Ex1_Queue_다리를지나는트럭 {
	static class Truck {
        int weight;
        int move;

        public Truck(int weight) {
            this.weight = weight;
            this.move = 0;
        }

        public void moving() {
            move++;
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int bridge_length = 2;
		int weight = 10;
		int[] truck_weights = {7,4,5,6};
		
		System.out.println("result ==> "+ solution(bridge_length,weight,truck_weights));
		

	}
	
	
	public static int solution(int bridge_length, int weight, int[] truck_weights) {
		int answer = 0;
        
        Queue<Truck> waitQ = new LinkedList<>(); //지나가지 않은 것
        Queue<Truck> moveQ = new LinkedList<>(); //다리위에 지나가는 중
        
//        System.out.println(waitQ.add(1));
//        System.out.println(waitQ.add(2));
//        System.out.println(waitQ);
//        System.out.println(waitQ.poll());
//        System.out.println(waitQ.remove());
//        System.out.println(waitQ.peek());
        
        for (int i: truck_weights){
        	waitQ.add(new Truck(i));
        }
//        System.out.println(waitQ.peek().weight);
//        System.out.println(waitQ.isEmpty());
        
        //waitQ와 moveQ가 빌때까지 계속 while문 실행
        int tempWeight = 0;
        while(!(waitQ.isEmpty() && moveQ.isEmpty())){
        	answer++;
        	
        	if(!waitQ.isEmpty() && tempWeight + waitQ.peek().weight <= weight){
        		tempWeight += waitQ.peek().weight;
                Truck a = waitQ.poll();
                moveQ.add(a);
        		
        	}
        	
        	for(Truck a : moveQ){
        		a.moving();
        	}        	
        	
        	if(moveQ.peek().move == bridge_length){
                tempWeight -= moveQ.peek().weight;
                moveQ.poll();
        
        	}
       
        }	
        return answer+1;
    }

}
