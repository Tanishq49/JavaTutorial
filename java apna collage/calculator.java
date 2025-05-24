import java.util.*;

public class calculator {
    public static void main(String[] args) {
        try {
            System.out.print("Enter the symbol of operator here:");
            Scanner sc = new Scanner(System.in);
            Scanner sc2 = new Scanner(System.in);
            String operator = sc2.nextLine();
            System.out.print("Enter the first number:");
            int a = sc.nextInt();
            System.out.print("Enter the second number:");
            int b = sc.nextInt();
            if (operator.equals("+")) {
                System.out.println("The sum of " + a + " and " + b + " is " + (a + b));
            } else if (operator.equals("-")) {
                System.out.println("The substraction of " + a + " and " + b + " is " + (a - b));
            } else if (operator.equals("*")) {
                System.out.println("The multiplication of " + a + " and " + b + " is " + (a * b));
            } else if (operator.equals("/")) {
                System.out.println("The division of " + a + " and " + b + " is " + (a / b));
            } else if (operator.equals("%")) {
                System.out.println("The remainder of " + a + " and " + b + " is " + (a % b));
            } else {
                System.out.println("Invalid Input");
            }
            sc.close();
            sc2.close();
        } catch (Exception e) {
            System.out.println("Some error occured in the code:" + e);
        }
    }
}
