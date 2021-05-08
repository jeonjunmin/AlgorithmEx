package lv1;

import java.util.LinkedList;
import java.util.Queue;

public class Ex5_Queue_키패드누르기 {
	
	static class leftHand {
        int num;
        int x =0;
        int y =0;

        public leftHand(int num) {
            this.num = num;
            this.x = -1;
            this.y = 0;
        }

        public void change(int a) {
        	this.num = a;
        	if(a==7){
        		this.x = -1;
        		this.y = 1;	
        	}
        	if(a==4){
        		this.x = -1;
        		this.y = 2;	
        	}
        	if(a==1){
        		this.x = -1;
        		this.y = 3;	
        	}
        	
        	
        	if(a==2){
        		this.x = 0;
        		this.y = 3;	
        	}
        	if(a==5){
        		this.x = 0;
        		this.y = 2;	
        	}
        	if(a==8){
        		this.x = 0;
        		this.y = 1;	
        	}
        	if(a==0){
        		this.x = 0;
        		this.y = 0;	
        	}
        }
        
        
    }
	
	static class rightHand {
		int num;
		int x =0;
        int y =0;

        public rightHand(int num) {
            this.num = num;
            this.x = 1;
            this.y = 0;
        }

        public void change(int a) {
        	this.num = a;
        	if(a==9){
        		this.x = 1;
        		this.y = 1;	
        	}
        	if(a==6){
        		this.x = 1;
        		this.y = 2;	
        	}
        	if(a==3){
        		this.x = 1;
        		this.y = 3;	
        	}
        	
        	
        	if(a==2){
        		this.x = 0;
        		this.y = 3;	
        	}
        	if(a==5){
        		this.x = 0;
        		this.y = 2;	
        	}
        	if(a==8){
        		this.x = 0;
        		this.y = 1;	
        	}
        	if(a==0){
        		this.x = 0;
        		this.y = 0;	
        	}
        }
    }

	public static void main(String[] args) {
		
	
//		int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};  //LRLLLRLLRRL
//		String hand = "right";
		
		int[] numbers = {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2};  //LRLLRRLLLRR
		String hand = "left";								
																	
		
		System.out.println("result ==> "+ solution(numbers,hand));
		

	}
	
	
	public static String solution(int[] numbers, String hand) {
		String answer = "";
        
		Queue<Integer> q = new LinkedList<>();
		
		for(int a : numbers){
			q.add(a);
		}
		
		leftHand lh = new leftHand(0);
		rightHand rh = new rightHand(0);
		
		while(!q.isEmpty()){
			
			int nownum = q.poll();
			double lefthandinstance = 0;
			double righthandinstance = 0;
			
			if(nownum==0){
				lefthandinstance = instatnce(0 , 0 , lh.x, lh.y);
				righthandinstance = instatnce(0 , 0 , rh.x, rh.y);
			}
			if(nownum==8){
				lefthandinstance = instatnce(0 , 1 , lh.x, lh.y);
				righthandinstance = instatnce(0 , 1 , rh.x, rh.y);
			}
			if(nownum==5){
				lefthandinstance = instatnce(0 , 2 , lh.x, lh.y);
				righthandinstance = instatnce(0 , 2 , rh.x, rh.y);
			}
			if(nownum==2){
				lefthandinstance = instatnce(0 , 3 , lh.x, lh.y);
				righthandinstance = instatnce(0 , 3 , rh.x, rh.y);
			}
			
			
			
			if(nownum==1||nownum==4||nownum==7){
				lh.change(nownum);
				answer += "L";
			}else if(nownum==3||nownum==6||nownum==9){
				rh.change(nownum);
				answer += "R";
			}else{
				if(lefthandinstance == righthandinstance){ //거리가 같으면
					if(hand .equals("left") ){
						lh.change(nownum);
						answer += "L";
					}else{
						rh.change(nownum);
						answer += "R";
					}
				}else{
					if(lefthandinstance > righthandinstance){
						rh.change(nownum);
						answer += "R";
					}else{
						lh.change(nownum);
						answer += "L";
					}
					
				}
			}
		}
		
        return answer;
    }
	
	public static double instatnce(int x, int y, int x1, int y1){
		double instance;
		int xd, yd;
//		yd = (int) Math.pow((y1-y),2);
//		xd = (int) Math.pow((x1-x),2);
//		instance = Math.sqrt(yd+xd);
		
		instance = Math.abs(x1-x) + Math.abs(y1-y);
		
		return instance;
	}
	

}
