package lv3;

import java.util.Arrays;

public class Ex1_이분탐색_입국심사2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int n = 6;
		int[] time = {7, 10 };
		
		
		System.out.println("result ==> "+ solution(n, time));
		

	}
	
	
	public static long solution(int n,  int[] times) {
		 Arrays.sort(times);
	        return binerySearch(times, n, times[times.length - 1]);
    }
	
	public static long binerySearch(int[] times, int n, long max){
        long left = 1, right = max * n;
        long mid = 0;
        long ans = Long.MAX_VALUE;
        System.out.println("times==>"+times.toString()+"   n===>"+n+"  max===>"+max);
        
        while(left <= right){
            mid = (left + right) / 2;
            System.out.println("===============================================================");
            System.out.println("===============================================================");
            System.out.println("left==>"+left+"   right===>"+right+"  mid===>"+mid+"    ans===>"+ans);
            if(isPassed(times, n, mid)){
                ans = ans > mid ? mid : ans;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
            System.out.println("left==>"+left+"   right===>"+right+"  mid===>"+mid+"    ans===>"+ans);
        }
        return ans;
    }
	
	public static boolean isPassed(int[] times, int n, long mid){
        long amount = 0;
        
        for(int i = 0 ; i < times.length ; ++i){
        	System.out.println("n===>"+n+"  mid===>"+mid+"  times[i]===>"+times[i]+"  mid/times["+i+"]===>"+mid / times[i]);
            amount += mid / times[i];
        }
        System.out.println("amount:"+amount+"   n:"+n);
        if(amount >= n) return true;
        else return false;
    }

}
