package Ques;

// https://www.geeksforgeeks.org/find-rotation-count-rotated-sorted-array/
public class RotationCount {
	public static void main(String[] args) {
		int[] arr = {7, 9, 11, 12, 5};
		System.out.println(findPivot(arr) + 1);
	}
	
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
}
