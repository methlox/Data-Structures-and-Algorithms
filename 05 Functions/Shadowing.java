public class Shadowing {

    static int a = 10;

    public static void main(String[] args) {
        System.out.println(a); // 10
        int a = 20;
        System.out.println(a); // 20. Lower level class variable shadows the upper level
        fun();
    }
    static void fun() {
        System.out.println(a); // 10
    }
}
