package lv2;

import java.util.HashMap;

public class Ex5_해시_전화번호목록 {
	static int ans, goal, n, num[], cache[];

	public static void main(String[] args) {
		
		String[] phone_book = {"12","123","1235","567","88","9912"};
		
		
		System.out.println("result===>"+solution(phone_book));
		
		
	}
	
	public static boolean solution(String[] phone_book) {
		boolean answer = true;
		HashMap<Integer,String> map1 = new HashMap<Integer,String>();
		
		for(int i = 0 ; i < phone_book.length ; i++){	
			map1.put(i, phone_book[i]);
		}
		
		for(Integer key : map1.keySet()){ 
			String value = (String) map1.get(key); 
			System.out.println(key + " : " + value); 
		}

        
		for(int i = 0 ; i < phone_book.length ; i++){	
			HashMap<Integer,String> map_temp = map1;
			map_temp.remove(i);
			for(Integer key : map_temp.keySet()){ 
				String value = (String) map_temp.get(key); 
				if(value.indexOf(phone_book[i]) == 0){
//				if(value.contains(phone_book[i])){
					System.out.println("value==>"+value+"  phone_book[i]==>"+phone_book[i]);
					answer = false;
				}
			}
		}
		
		
        return answer;
	}
	
	

}
