package lv2;

public class Ex3_깊이너비우선탐색_타겟넘버 {
	static int ans, goal, n, num[], cache[];

	public static void main(String[] args) {
		
		int[] numbers = {1,1,1,1,1};
		int target = 3;
		
		
		System.out.println("result===>"+solution(numbers,target));
		
		
	}
	
	public static int solution(int[] numbers , int target) {
		int answer = 0;
        answer = dfs(numbers, 0, 0, target);
        return answer;
	}
	
	 static int dfs(int[] numbers, int n, int sum, int target) {
	        if(n == numbers.length) {
	            if(sum == target) {
	                return 1;
	            }
	            return 0;
	        }
	        return dfs(numbers, n + 1, sum + numbers[n], target) + dfs(numbers, n + 1, sum - numbers[n], target);
	    }
	

}
