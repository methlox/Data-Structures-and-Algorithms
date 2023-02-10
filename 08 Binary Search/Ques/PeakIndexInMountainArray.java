package Ques;// https://leetcode.com/problems/peak-index-in-a-mountain-array/
// also known as bitonic array

public class PeakIndexInMountainArray {
	public static void main(String[] args) {
		int[] arr = {0,10,5,2};
		System.out.println(method(arr));
	}
	
	static int method(int[] arr) {
		
		int start = 0;
		int end = arr.length - 1;
		
		while (start < end) {
			int mid = start + (end - start) / 2;
			
			if (arr[mid] > arr[mid + 1]) {
				end = mid;
			}
			else {
				start = mid + 1;
			}
		}
		
		return start; //or return end since in the end start == end
	}
}
