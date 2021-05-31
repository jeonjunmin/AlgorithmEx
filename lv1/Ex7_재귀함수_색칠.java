package lv1;

import java.util.Arrays;

public class Ex7_재귀함수_색칠 {
	static final int SIZE = 5;
	static final int COLOR = 2;
	static int [][] map = 
		{{0,0,0,0,0},
		 {0,0,1,1,0},
		 {0,0,0,0,1},
		 {0,0,0,0,0},
		 {0,0,1,0,0},
		};
	

	public static void main(String[] args) {
		
		color(0,0);
		
		for(int i=0 ; i < SIZE;i++){
			for(int j=0 ; j< SIZE ; j++){
				System.out.print(map[i][j]+" ");
			}
			System.out.println();
		}

	}
	
	public static void color (int x , int y){
		if(map[x][y] != 1)  
			map[x][y] = COLOR;
		
		if(x-1 >= 0 && map[x-1][y] != COLOR && map[x-1][y] != 1)
			color(x-1,y);
		if(x+1 <= SIZE-1 && map[x+1][y] != COLOR && map[x+1][y] != 1)
			color(x+1,y);
		if(y+1 <= SIZE-1 && map[x][y+1] != COLOR && map[x][y+1] != 1)
			color(x,y+1);
		if(y-1 >= 0 && map[x][y-1] != COLOR && map[x][y-1] != 1)
			color(x,y-1);
		
		
		
	}
	
	

}
