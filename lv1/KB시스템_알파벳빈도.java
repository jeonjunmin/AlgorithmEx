package lv1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KB시스템_알파벳빈도 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		
		int [] alpcount = new int[26];
		String outputValue = "";
		input = input.replace(" ","");
		String[] abcArray = input.split("");		
		
		
		for (int i = 0 ; i < abcArray.length ; i++){
			
			String alph = abcArray[i].toLowerCase();
			System.out.println("alph===>"+alph);
			char [] charAbc  = alph.toCharArray();
			System.out.println("alph의 아스키코드==>"+(int)charAbc[0]);
			
			
			for(int j = 97 ; j <= 122 ; j++){  // 97~122알파벳 소문자  , 65~90 알파벳 대문자
				if(j == ((int)charAbc[0])){    //알파벳을 아스키코드 ,Abc[0]은 알파벳
					outputValue = outputValue + "," +  Integer.toString(j);  //아스키코드들을 ","구분자로 저장
					System.out.println(outputValue);		
				}
			}
		}
		
		String [] tryabcArray = outputValue.split(",");  //문자들의 아스키코드들 스트링으로
		
		
		for(int z = 97 ; z <= 122; z++){
			System.out.println("@@@@@@@@@@"+Integer.toString(z));
			int count = 0;
			for(int y = 0 ; y <tryabcArray.length ; y++ ){
				if(tryabcArray[y].equals(Integer.toString(z))){ //아스키코드 출력
					count ++;					
				}
			}
			System.out.println(Character.toString ((char) z) + " : "+ count);		 //아스키코드를 알파벳으로		
		}
		
		
		
		
        		
	}
	

}
