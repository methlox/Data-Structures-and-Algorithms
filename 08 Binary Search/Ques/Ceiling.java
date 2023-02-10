package Ques;

// given an array find the smallest number bigger than or equal to the target element
public class Ceiling {

	public static void main(String[] args) {
		int[] arr = {2, 4, 5, 29, 29, 58, 60, 128};
		int target = 6;
		System.out.println(arr[ceiling(arr, target)]);

	}
	
	static int ceiling(int[] arr, int target) {
		int start = 0;
		int end = arr.length - 1;
		
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
		return start;
	}

}
