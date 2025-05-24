import java.util.*;

public class factorial {
    public static void fact(int number) {
        int factorial = 1;
        for (int i = number; i >= 1; i--) {
            factorial = factorial * i;
        }
        System.out.println(factorial);
        return;
    }

    public static void main(String[] args) {
        System.out.println("Enter the number to find its factorial:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        fact(num);
        sc.close();
    }
}
