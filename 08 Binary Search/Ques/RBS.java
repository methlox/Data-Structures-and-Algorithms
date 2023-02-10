package Ques;

// https://leetcode.com/problems/search-in-rotated-sorted-array/
// rotated binary search
// this ques can be solved through three diff methods, one of which involves recursion

public class RBS {
	public static void main(String[] args) {
		int[] arr = {4,5,6,7,0,1,2};
		int target = 0;
		System.out.println(search(arr, target));
	}
	
	static int search(int[] arr, int target) {
		int pivot = findPivot(arr);
		
		// if pivot is not found run a simple binary search
		if (pivot == -1) {
			return binarySearch(arr, target, 0, arr.length - 1);
		}
		
		if (arr[pivot] == target) {
			return pivot;
		}
		
		if (target >= arr[0]) {
			return binarySearch(arr, target, 0, pivot - 1);
		} else {
			return binarySearch(arr, target, pivot + 1, arr.length - 1);
		}
	}
	
	// this method wont work for duplicate values
	static int findPivot(int[] arr) {
		int start = 0;
		int end = arr.length - 1;
		
		while(start <= end) {
			
			int mid = start + (end - start) / 2;
			
			// testing four cases
			//1
			if (mid < end && arr[mid] > arr[mid + 1]) {
				return mid;
			}
			
			//2
			if (arr[mid] < arr[mid - 1]) {
				return mid - 1;
			}
			
			//3
			if (arr[start] < arr[mid]) {
				start  = mid + 1;
			}else {
				end = mid - 1;
			}
			
		}
		return -1;
	}
	
	// for duplicate values
	static int findPivotWithDuplicates(int[] arr) {
		int start = 0;
		int end = arr.length - 1;
		
		while(start <= end) {
			
			int mid = start + (end - start) / 2;
			
			// testing four cases
			//1
			if (mid < end && arr[mid] > arr[mid + 1]) {
				return mid;
			}
			
			//2
			if (arr[mid] < arr[mid - 1]) {
				return mid - 1;
			}
			
			//3 if end start and middle are equal then we can just ignore the duplicates
			if (arr[end] == arr[mid] && arr[start] == arr[mid]) {
				

//				start++;
//				end--;
				// NOTE: what if these elements were pivots??
				
				//check if start is the pivot
				if (arr[start] > arr[start + 1]) {
					return start;
				}
				start++;
				
				//check if end is the pivot
				if (arr[end] < arr[end - 1]) {
					return end;
				}
				end--;
			}
			
			//4
			// left side is sorted so the pivot should be in the right
			else if (arr[start] < arr[mid] || arr[start] == arr[mid] && arr[mid] > arr[end]) {
				start = mid + 1;
			}
			else {
				end = mid - 1;
			}
			
		}
		return -1;
	}
	
	static int binarySearch(int[] arr, int target, int start, int end) {
		
		while (start <= end) {
			int mid = start + (end - start)/2;
			
			if (target == arr[mid]) {
				return mid;
			}
			
			else if (target < arr[mid]) {
				end = mid - 1;
			}
			
			else {
				start = mid + 1;
			}
			
		}
		return -1;
	}
}
