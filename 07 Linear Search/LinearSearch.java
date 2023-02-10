public class LinearSearch {

    public static void main(String[] args) {
        int[] arr = {12, 34, 28, 83, 29, 293, 39};
        int target =  28;
        System.out.println(linearSearch(arr, target));
    }

    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }

        return -1;
    }

}