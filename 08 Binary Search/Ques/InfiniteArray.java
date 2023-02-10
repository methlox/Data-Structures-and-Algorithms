package Ques;
// Find position of an element in a sorted array of infinite numbers
// Amazon
// https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/
public class InfiniteArray {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 6, 4, 34, 56, 34};
		System.out.println(ans(arr, 4));
	}
	static int ans(int[] arr, int target) {
		// firstly define a range
		int start = 0;
		int end = 1;
		
		// condition for the target to  lie in the range
		while (target > arr[end]) {
			int newStart = end + 1;
			// double the box size
			// end = end + previous box size*2
			end = end + (end - start + 1) * 2;
			start = newStart;
		}

		return binarySearch(arr, target, start, end);
	}
	static int binarySearch(int[] arr, int target,  int start, int end) {
		
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
