package lv1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;


public class Ex1_포켓몬 {

	public static void main(String[] args) {
		int[] nums = {3,1,2,3};
		
		System.out.println("result===>"+solution2(nums));
		
		
	}
	
	public static int solution(int[] nums) {
		int answer = 0;
        
        int a = nums.length;
        int pick = a/2;
        System.out.println("pick--->"+pick);
        
        List<Integer> list = new ArrayList<Integer>();
		for(int i=0; i<nums.length; i++){
            if(!list.contains(nums[i]))	// list에 포함되어있는지 아닌지 체크
				list.add(nums[i]);
        }
			
        Collections.sort(list);

        System.out.println("list--->"+list.size());

        System.out.println("max--->"+Math.max(pick,list.size()));


        answer = Math.min(pick,list.size());
		
		return answer;
	}
	
	
	public static int solution1(int[] nums) {
        return Arrays.stream(nums)
                .boxed()
                .collect(Collectors.collectingAndThen(Collectors.toSet(),
                        phonekemons -> Integer.min(phonekemons.size(), nums.length / 2)));
    }
	
	public static int solution2(int[] nums) {
        //1. 기존 length를 구한다.
        //2. 중복값을 제거한 length를 구한다.
        //3. 두 값중 최소값이 정답.
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 0 ; i < nums.length; i++){
            if(!list.contains(nums[i])){
                list.add(nums[i]);
            }
        }

        return nums.length/2 > list.size()?list.size():nums.length/2;
    }

}
