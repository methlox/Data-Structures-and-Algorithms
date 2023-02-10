package Ques;

// https://leetcode.com/problems/find-smallest-letter-greater-than-target/
// find the smallest character greater than the target character
// the letters wrap around
public class CeilingChar {
	public static void main(String[] args) {
		char[] arr = {'a', 'c', 'f', 'g'};
		char target =  'z';
		System.out.println(ceiling(arr, target));
	}
	
	static char ceiling(char[] arr, char target) {
		int start = 0;
		int end = arr.length - 1;
		
		while (start <= end) {
			int mid = start + (end - start)/2;
			
			if (target < arr[mid]) {
				end = mid - 1;
			}
			
			else {
				start = mid + 1;
			}
			
		}
		
//		if(start > arr.length - 1) {
//			start = start - end - 1;
//		}
		return arr[start % arr.length];
	}
}