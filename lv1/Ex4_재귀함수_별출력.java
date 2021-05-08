package lv1;

import java.util.ArrayList;
import java.util.List;


public class Ex4_재귀함수_별출력 {

	public static void main(String[] args) {
		int n = 5;
		
		solution(n);
		
		
        		
	}
	
	public static void solution(int n ) {
		if(n==0){
			return;
		}
		for(int i = 0 ; i < n ; i++){
			System.out.print("*");
		}
		System.out.println("\n");
		solution(n-1);
		for(int i = 0 ; i < n ; i++){
			System.out.print("*");
		}
		System.out.println("\n");
	}

}
