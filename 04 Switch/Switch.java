import java.util.Scanner;
public class Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the name of the fruit: ");
        String fruit = in.next();

        /* switch (fruit) {
            case "Mango":
                System.out.println("Of yellow colour");
                break;

            case "Apple":
                System.out.println("An oval shape");
                break;

            default:
                System.out.println("Please enter a valid fruit");
        } */

        switch (fruit) {
            case "Mango" -> System.out.println("Of yellow colour");
            case "Apple" -> System.out.println("An oval shape");
            default -> System.out.println("Please enter a valid fruit");
        }
    }
}