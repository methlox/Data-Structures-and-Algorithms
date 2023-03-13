package Ques;

// given several dices and a number find all the possible combinations of numbers on dices to achieve the result
// Amazon

public class Dice {
	public static void main(String[] args) {
		dice("", 4);
	}
	
	static void dice(String p, int target) {
		if (target == 0) {
			System.out.println(p);
			return;
		}
		
		for (int i = 1; i <= 6 && i <= target; i++) {
			dice(p + i, target - i);
		}
	}
}