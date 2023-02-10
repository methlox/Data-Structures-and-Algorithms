package Ques;

// return the biggest number that is smaller than or equal to the target element
public class Floor {

	public static void main(String[] args) {
		int[] arr = {2, 4, 5, 29, 29, 58, 60, 128};
		int target = 6;
		System.out.println(arr[floor(arr, target)]);

	}
	
	static int floor(int[] arr, int target) {
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
		return end;
	}

}
