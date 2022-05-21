package lv1;

import java.util.LinkedList;
import java.util.Queue;

public class KB시스템_달팽이 {
	

	public static void main(String[] args) {
		
//		1  2  3  4  5
//		16 17 18 19 6
//		15 24 25 20 7
//		14 23 22 21 8
//		13 12 11 10 9
		
		draw(3);
        draw(5);
        draw(9);


	}
	
private static void draw(int size) {
        
        int input = size;
        int i, j, m, n;
        int cnt = 1;
        int right = 0, bottom = -1, top = 1;
        int[][] snailArr = new int[size][size];
        
        for(i=input; i>=0; i--) { //4
            
            for(j=0; j<input; j++) {
                bottom = bottom + top;
                snailArr[right][bottom] = cnt;
                cnt++;
            }
            
            input--; //3
            
            for(j=0; j<input; j++) {
                right = right + top;
                snailArr[right][bottom] = cnt;
                cnt++;
            }
            
            top = top*(-1); // -1
        }
        
        for(m=0; m<size; m++) {
            for(n=0; n<size; n++) {
                System.out.print(snailArr[m][n] + "\t");
                
            }
            System.out.println("");
        }
        System.out.println("");
    }
	

}
