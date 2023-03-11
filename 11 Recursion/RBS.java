// find the index of the target element in a rotated binary search

public class RBS {
	public static void main(String[] args) {
		int[] arr = {5, 6, 7, 8, 9, 1, 2, 3};
		System.out.println(findIndex(arr, 2, 0, arr.length - 1));
	}
	
	static int findIndex(int[] arr, int target, int s, int e) {
		if (s > e) {
			return - 1;
		}
		
		int m = s + (e - s) / 2;
		
		if (arr[m] == target) {
			return m;
		}
		
		if (arr[s] <= arr[m]) {
			if (target <= arr[m] && target >= arr[s]) {
				return findIndex(arr, target, s, m - 1);
			} else {
				return findIndex(arr, target, m + 1, e);
			}
		}
		
		if (target >= arr[m] && target <= arr[e]) {
			return findIndex(arr, target, m+1, e);
		}
		
		return findIndex(arr, target, s, m - 1);
	}
}