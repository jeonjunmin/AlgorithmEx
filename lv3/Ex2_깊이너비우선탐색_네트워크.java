package lv3;

import java.util.Arrays;

public class Ex2_깊이너비우선탐색_네트워크 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int n = 3;
		int[][] computers = {{1,1,0},{1,1,0},{0,0,1} };
		
		
		System.out.println("result ==> "+ solution(n, computers));
		
		

	}
	
	
	public static int solution(int n,  int[][] computers) {
		int answer = 0;
		
//		for(int i = 0 ; i < computers.length ; i++){
//			for(int j = 0 ; j < computers[i].length ; j++){
//				System.out.println("i:"+i+"j:"+j+"===>"+computers[i][j]);
//			}
//		}
		
		for(int i = 0 ; i < computers.length ; i++){
			for(int j = 0 ; j < computers[i].length ; j++){
				if(i==j){
					continue;
				}
				if(computers[i][j] == 1){
					
				}
			}
		}
		
        return answer;
    }
}
