import java.util.*;

public class evenOdd {
    public static void main(String[] args) {
        System.out.print("Enter any number here:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println(num + " is an even number");
        } else {
            System.out.println(num + " is an odd number");
        }
    }
}