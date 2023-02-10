package Ques;

// given an array of integers, return how many of them contain an even number of digits
public class EvenDigits {

    public static void main(String[] args) {

        int[] nums = {12883, 283, 23, -23942, 2334, 234, 2394, 2034, 39545};

        System.out.println(findNumbers(nums));
    }

    static int findNumbers(int[] nums) {
        int count = 0;
        for(int num : nums) {
            if (evenOptimized(num)) {
                count++;
            }
        }
        return count;
    }

    static boolean even(int num) {

        // if the number is negative convert it into positive otherwise it will return zero
        if (num < 0) {
            num = num * -1;
        }

        int count = 0;
        while(num > 0) {
            count++;
            num = num/10;
        }

        return ((count & 1) == 0);

    }

    static boolean evenOptimized(int num) {
        // if the number is negative convert it into positive otherwise it will return zero
        if (num < 0) {
            num = num * -1;
        }

        int digits = (int)(Math.log10(num)) + 1;

        // division by 2 and & operator with 1 are the same
        return ((digits & 1) == 0);


    }

}