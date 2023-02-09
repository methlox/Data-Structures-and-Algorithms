import java.util.Arrays;

public class VarArgs {

    public static void main(String[] args) {
        fun(1,3,4,5,6,3,2,45,546,45);
    }

    static void fun( int ...v){  // passes an array of integers. we can write anything in place of v
        System.out.println(Arrays.toString(v));
    }
}
