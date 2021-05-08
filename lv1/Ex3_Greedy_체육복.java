package lv1;

import java.util.ArrayList;
import java.util.List;


public class Ex3_Greedy_체육복 {

	public static void main(String[] args) {
		int n = 10;
		int[] lost = {3,9,10};
		int[] reserve = {3,9,10};
//		result==>10
		
//		int n = 10;
//		int[] lost = {3,9,10};
//		int[] reserve = {3,8,9};
//		result==>9
		
		
//		int n = 5;
//		int[] lost = {2,4};
//		int[] reserve = {1,3,5};
//		result==>5
		
		
//		 1,2,3,4,5,6,7,8,9,10
//		 1,1,1,1,1,1,1,2,1,0
		
		System.out.println("result===>"+solution(n,lost,reserve));
		
		
        		
	}
	
	public static int solution(int n ,int[] lost , int[] reserve) {
		int answer = 0;
		
		answer = n - lost.length;
		
		List<Integer> lost_list = new ArrayList<Integer>();
		List<Integer> temp_lost_list = new ArrayList<Integer>();
		List<Integer> reserve_list = new ArrayList<Integer>();
		
		for(int a : lost){
			lost_list.add(a);
		}
		
		for(int a : reserve){
			reserve_list.add(a);
		}
		
		
		int tempcount = 0;
		for(int i = 0 ; i < lost_list.size() ; i++){
			for(int k = 0 ; k < reserve_list.size() ; k++ ){
				if(lost_list.get(i)==reserve_list.get(k)){
					reserve_list.remove(k);
					System.out.println("@@@---->["+i+"]==>"+lost_list.get(i));
					temp_lost_list.add(lost_list.get(i));
					tempcount++;
					
				}
			}
		}
		
		for(int i = 0 ; i < temp_lost_list.size() ; i++){
			for(int k = 0 ; k < lost_list.size() ; k++ ){
				if(temp_lost_list.get(i)==lost_list.get(k)){
					lost_list.remove(k);
					System.out.println("@@@---->["+i+"]==>"+temp_lost_list.get(i));
					temp_lost_list.add(temp_lost_list.get(i));
					
				}
			}
		}
		
		answer= answer+tempcount;
		System.out.println("answer value===>" + answer);
		System.out.println("reserve value===>" + reserve_list);
		System.out.println("lost value===>" + lost_list);
		
		int count = 0;
        for(int a : reserve_list){
        	for(int i = 0 ; i <  lost_list.size() ; i++){
        		if(lost_list.get(i)==a+1){
        			System.out.println("@@1==>"+lost_list.get(0));
        			lost_list.remove(i);
        			count++;
        			break;
        		}else if(lost_list.get(i)==a-1){
        			System.out.println("@@2==>"+lost_list.get(0));
        			lost_list.remove(i);
        			count++;
        			break;
        		}else{
        			System.out.println("@@@3==>"+lost_list.get(0));
        			continue;
        		}
        	}
        	
        }
      
		return answer+count;
	}

}
