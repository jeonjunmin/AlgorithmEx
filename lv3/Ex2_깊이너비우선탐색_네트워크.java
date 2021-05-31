package lv3;

import java.util.LinkedList;
import java.util.Queue;

public class Ex2_깊이너비우선탐색_네트워크 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int n = 3;
//		int[][] computers = {{1,1,0},{1,1,0},{0,0,1} };
		int[][] computers = {{1,1,0},{1,1,1},{0,1,1} };
		
		
		System.out.println("result ==> "+ solution(n, computers));
		
		

	}
	
	
	public static int solution(int n,  int[][] computers) {
		int answer = 0;
		
		boolean visit[] = new boolean[computers.length];
		Queue<Integer> q = new LinkedList<Integer>();
		
		for (int i = 0; i < n; i++) {
			if (!visit[i]) {
				visit[i] = true;
				q.add(i);
				while (!q.isEmpty()) {
					int value = q.poll();
					System.out.println(value);
					for (int j = 0; j < n; j++) {
						if (j == i)
							continue;
						if (j < i)
							continue;
						if (visit[j])
							continue;
						if (computers[value][j] == 1) {
							q.add(j);
							visit[j] = true;
						}
					}
				}
				answer++;
			}
		}


		
        return answer;
    }
}
