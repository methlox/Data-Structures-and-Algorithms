package Ques;

// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
// Given an array of integers nums sorted in asc order,
// find the starting and ending position of a given target value.
// If target is not found in the array, return [-1, -1]

import java.util.Arrays;
public class FirstLastPos {
	public static void main(String[] args) {
		int[] nums = {5,7,7,8,8,10};
		int target = 8;
		System.out.println(Arrays.toString(method(nums, target)));
		
	}
	
	static int[] method(int[] arr, int target) {
		
		int[] ans = {-1, -1};
		
		// check for first occurrence of target first 
		ans[0] = search(arr, target, true);
		
		if (ans[0] !=  0) {
			ans[1] = search(arr, target, false);
		}
		
		return ans;
	}
	
	// this function returns index value of the target
	static int search(int[] arr, int target, boolean firstIndex) {
		
		int ans = -1;
		
		int start = 0;
		int end = arr.length - 1;
		
		while (start <= end) {
			int mid = start + (end - start)/2;
			
			if (target == arr[mid]) {
				
//				potential answer is found
				ans = mid;
				
				if (firstIndex) {
					end = mid - 1;
				}
				else {
					start = mid + 1;
				}
			}
			
			else if (target < arr[mid]) {
				end = mid - 1;
			}
			
			else {
				start = mid + 1;
			}
			
		}
		return ans;
	}
}
