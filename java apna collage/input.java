import java.util.*;

public class input {
     public static void main(String[] args) {
        System.out.print("Enter the value of a:");
        Scanner sc1 = new Scanner(System.in);
        int a = sc1.nextInt();
        System.out.print("Enter the value of b:");
        int b = sc1.nextInt();
        int res = a + b;
        System.out.println("The sum of and b is " + res);
    }
}