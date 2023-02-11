package Ques;

// https://leetcode.com/problems/set-mismatch/

import java.util.ArrayList;
import java.util.List;

public class SetMismatch {
	public static void main(String[] args) {
		int[] arr = {1,2,2,4};
		System.out.println(findErrorNums(arr));
	}
	
	static List<Integer> findErrorNums(int[] arr) {
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
				sol.add(arr[j]);
				sol.add(j+1);
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
