import java.util.ArrayList;

// search for a target element in the array

public class Search {
	public static void main(String[] args) {
		int[] arr = {1, 2, 5, 5, 9, 8, 5};
		System.out.println(findIndex(arr, 5, 0));
		
		findAllIndex(arr, 5, 0);
		System.out.println(list);
		
		System.out.println(findAllIndex2(arr, 5, 0));
	}
	
	// check whether it exists
	static boolean find(int[] arr, int target, int index) {
		if (index == arr.length) {
			return false;
		}
		
		return arr[index] == target || find(arr, target, index + 1);
	}
	
	// finds the index
	static int findIndex(int[] arr, int target, int index) {
		if (index == arr.length) {
			return -1;
		}
		
		if (arr[index] == target) {
			return index;
		}
		
		else {
			return findIndex(arr, target, index + 1);
		}
	}
	
	// finds all the indexes
	static ArrayList<Integer> list = new ArrayList<>();
	static void findAllIndex(int[] arr, int target, int index) {
		if (index == arr.length) {
			return;
		}
		
		if (arr[index] == target) {
			list.add(index);
		}
		
		findAllIndex(arr, target, index + 1);
		
	}
	
	// find all the index but create the list inside the function call instead of taking it in the argument
	// issue is that for ever function call a new list will be created
	// sol - while passing the below function calls ans to the above we check if the above list has anything and we add that to our current list
	static ArrayList<Integer> findAllIndex2(int[] arr, int target, int index) {
		ArrayList<Integer> list = new ArrayList<>();
		if (index == arr.length) {
			return list;
		}
		
		// this list will contain ans from the current function call only
		if (arr[index] == target) {
			list.add(index);
		}
		
		ArrayList<Integer> ansFromBelowCalls = findAllIndex2(arr, target, index + 1);
		
		list.addAll(ansFromBelowCalls);
		return list;
	}
}