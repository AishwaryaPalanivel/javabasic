package practice_programs;

import java.util.HashMap;
import java.util.Map;

public class Occuranceofcharacter {
	public static void main(String[] args) {
		String data= "i am doing good today";
		int count=0;
		char[] char_arr= data.toCharArray();
		Map<Character,Integer> convertorch= new HashMap<Character,Integer>();
		for (char ch : char_arr) {
			if (convertorch.containsKey(ch)) {
				convertorch.put(ch, convertorch.get(ch)+1);
			} 
			else{
				convertorch.put(ch, 1);
			}
		}
		System.out.println(convertorch);
	}
				
			
			
		}
	

