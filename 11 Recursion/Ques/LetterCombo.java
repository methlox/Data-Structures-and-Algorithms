package Ques;

import java.util.ArrayList;

// https://leetcode.com/problems/letter-combinations-of-a-phone-number/

public class LetterCombo {
	public static void main(String[] args) {
		combination("", "23");
//		System.out.println(combinationList("", "23"));
	}
	
	static void combination(String p, String up) {
		if(up.isEmpty()) {
			System.out.println(p);
			return;
		}
		
		int digit = up.charAt(0) - '0'; // this will convert '2' into 2
		for(int i = (digit - 1) * 3; i < digit * 3; i++) {
			char ch = (char) ('a' + i);
			combination(p + ch, up.substring(1));
			}
	}
	
	static ArrayList<String> combinationList(String p, String up){
		if(up.isEmpty()) {
			ArrayList<String> list = new ArrayList<>();
			list.add(p);
			return list;
		}
		
		int digit = up.charAt(0) - '0';
		
		ArrayList<String> list = new ArrayList<String>();
		
		for(int i = (digit - 1) * 3; i < digit * 3; i++) {
			char ch = (char) ('a' + i);
			list.addAll(combinationList(p + ch, up.substring(1)));
		}
		
		return list;
	}
}