package lv1;

public class Ex8_Greedy_음양더하기 {

	public static void main(String[] args) {
		int[] absolutes = {4,7,12};
		boolean[] signs = {true,false,true};
		
		System.out.println("result===>"+solution(absolutes,signs));
		
		
        		
	}
	
	public static int solution(int[] absolutes , boolean[] signs) {
		int answer = 0;
		
		for(int i = 0 ; i < absolutes.length ; i++){
			System.out.println("i:"+i+"  absolutes==>"+absolutes[i] + "  signs===>"+signs[i]);
			
			if(!signs[i]){
				absolutes[i] = -absolutes[i];
			}
		}
		
		
		for(int i = 0 ; i < absolutes.length ; i++){			
			answer += absolutes[i];
		}
		
      
		return answer;
	}

}
