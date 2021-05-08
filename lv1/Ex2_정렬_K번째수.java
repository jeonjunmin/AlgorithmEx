package lv1;

import java.util.ArrayList;
import java.util.List;


public class Ex2_정렬_K번째수 {

	public static void main(String[] args) {
		
		int[] array = {1,5,2,6,3,7,4};
		int[][] commands = {{2,5,3},{4,4,1},{1,7,3}};
		
		System.out.println("result===>"+solution(array,commands));
		
		
	}
	
	public static int[] solution(int[] array, int[][] commands) {
		
		int[] answer = new int[commands.length];
		
		for (int i = 0 ; i < commands.length ; i++){
			int a = commands[i][0];
			int b = commands[i][1];
			int c = commands[i][2];
			List<Integer> list = new ArrayList<Integer>();
			
			for(int k = a-1 ; k < b ; k++){
				list.add(array[k]);
			}
			
			list.sort(null);
			System.out.println("@@@@"+list.toString());
			System.out.println(list.get(c-1));
			
			answer[i] = list.get(c-1);
			
		}
		
	
      
		return answer;
	}

}
