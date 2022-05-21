package lv1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KB시스템_배열반복_2차원구간합 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//사이즈 입력
		String input = br.readLine();
		int k = Integer.parseInt(input)  ;
		
		int[][] arrData = new int[k][k];
		String [] arr = new String[k]; 
		
		//2차원 배열 입력
		for(int i = 0 ; i < k ; i++){
			String val = br.readLine();
			arr[i] = val;			
		}
		
		//인덱스 입력
		String input_ix = br.readLine();
		String [] idxArray = input_ix.split(" ");
		int [] idxsize = new int [4];
		for(int n = 0 ; n < idxsize.length ; n++){
			idxsize[n] = Integer.parseInt(idxArray[n])  ;
		}
		
		
		for(int z = 0 ; z < arr.length ; z++){
			String[] abcArray = arr[z].split(" ");
			for(int m = 0 ; m < abcArray.length ; m++){
				arrData[z][m] = Integer.parseInt(abcArray[m]);
			}			
		}	

		
		
		System.out.println("result===>"+solution(arrData , idxsize));
		
		
        		
	}
	
	public static int solution(int[][] arrData ,int [] idx) {
		
//		for(int i = 0 ; i < arrData.length ; i++){
//			for(int k = 0 ; k < arrData[i].length ; k++){
//				System.out.print(arrData[i][k]+"  ");
//			}
//			System.out.println("");
//		}
//		System.out.println("====================");
		int x1=idx[0];
		int y1=idx[1];
		int x2=idx[2];
		int y2=idx[3];
		
		int count = 0;
		for(int m = x1 ; m <= x2 ; m++){			
			for(int n = y1 ; n <= y2 ; n++){
//				System.out.print(arrData[m][n]+"  ");
				count += arrData[m][n];
			}
//			System.out.println("");
		}
		
		
       return count ;
    }

}
