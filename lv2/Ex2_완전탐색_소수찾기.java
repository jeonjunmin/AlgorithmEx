package lv2;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;


public class Ex2_완전탐색_소수찾기 {
	static List<Integer> resultresultarray = new ArrayList<>();
	public static void main(String[] args) {
		
		String numbers = "17";
		
		
		System.out.println("result===>"+solution(numbers));
		
		
	}
	
	public static int solution(String numbers) {
		int answer = 0;
		int[] temparray = new int[numbers.length()];
		List<String> arr = new ArrayList<>();
		List<String> result = new ArrayList<>();

		for (int i = 0; i < numbers.length(); i++) {
			temparray[i] = Integer.parseInt(numbers.substring(i, i + 1));
			arr.add(numbers.substring(i, i + 1));
		}

		int a = 0;
		for (int i = 1; i <= arr.size(); i++) {
			reculsion(arr, result, arr.size(), i);
		}

		LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();

		for (int j : resultresultarray) {
			linkedHashSet.add(j);
		}
		for (int k : linkedHashSet) {
			if (sosu(k) == true) {
				answer++;
			}
		}

		return answer;
	}
	
	public static void reculsion(List<String> arr, List<String> result, int n, int r) {

		int resultresult = 0;
		if (r == 0) {
			String resultNum = "";
			System.out.println("모든 경우의 조합===>"+result.toString());
			for (String a : result) {
				resultNum += a;
			}
			resultresult = Integer.parseInt(resultNum);
			resultresultarray.add(resultresult);
		}

		for (int i = 0; i < n; i++) {
			result.add(arr.remove(i));
			reculsion(arr, result, n - 1, r - 1);
			arr.add(i, result.remove(result.size() - 1));
		}

	}

	public static boolean sosu(int num) {
		int count = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				count++;
			}
		}

		if (count == 2) {
			return true;
		} else {
			return false;
		}

	}
	

}
