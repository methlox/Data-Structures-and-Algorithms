import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {

        // swap numbers
        int a = 10;
        int b = 20;
        swap(a, b);
        System.out.println(a + " " + b);

        // strings
        String name = "Sid";
        changename(name);
        System.out.println(name);

        // arrays
        int[] arr = {1, 3, 4, 5, 3};
        changeArr(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void changeArr(int[] arr) {
        arr[0] = 99;
    }

    static void changename(String name) {
        name = "Ranaa";
    }

    static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }
}
