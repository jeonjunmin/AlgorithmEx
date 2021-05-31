package lv2;

import java.util.Arrays;

public class Ex7_재귀함수_단지수측정 {
	static final int SIZE = 5;
	static final int APART = 1;
	
	static int appartCnt = 0;  //단지수
	static int[] houseHold = new int[10]; //단지 세대수
	
	
	static int [][] map = 
		{{0,0,0,1,1},
		 {0,0,0,0,1},
		 {1,0,0,0,0},
		 {1,1,0,0,0},
		 {1,1,0,1,1},
		};
	

	public static void main(String[] args) {
		
		
		for(int i=0 ; i < SIZE;i++){
			for(int j=0 ; j< SIZE ; j++){
				if(map[i][j]==1){
					doFunc(i,j,appartCnt);
					appartCnt++;
				}
			}
		}
		
		System.out.println("세대수:"+appartCnt);
		for(int i: houseHold){
			System.out.println(i + "  ");
		}
	}
	
	public static void doFunc (int x , int y, int appartIndex){
		map[x][y] = 0;
		houseHold[appartIndex]++;
		
		if(x-1 >= 0 && map[x-1][y] == APART)
			doFunc(x-1,y,appartIndex);
		if(x+1 <= SIZE-1 && map[x+1][y] == APART)
			doFunc(x+1,y,appartIndex);
		if(y+1 <= SIZE-1 && map[x][y+1] == APART)
			doFunc(x,y+1,appartIndex);
		if(y-1 >= 0 && map[x][y-1] == APART)
			doFunc(x,y-1,appartIndex);
		
		
		
	}
	
	

}
