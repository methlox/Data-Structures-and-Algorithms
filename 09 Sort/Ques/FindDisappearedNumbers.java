package Ques;

// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
// GOOGLE

import java.util.ArrayList;
import java.util.List;

public class FindDisappearedNumbers {
	public static void main(String[] args) {
		int[] arr = {4, 3, 2, 7, 8, 2 , 3, 1};
		System.out.println(find(arr));
	}
	
	static List<Integer> find(int[] arr) {
		int i = 0;
		while(i < arr.length) {
			int correct = arr[i] - 1;
			if (arr[i] != arr[correct]) {
				swap(arr, i, correct);
			}
			else {
				i++;
			}
		}
		
		// we'll be using array list
		List<Integer> sol = new ArrayList<>();

		// the array is sorted now
		for (int j = 0; j < arr.length; j++) {
			if (arr[j] != j + 1) {
				sol.add(j + 1);
			}
			
		}
		
		return sol;
	}
	
	static void swap(int[] arr, int first, int second) {
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
	}
}
