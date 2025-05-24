import java.util.*;

public class ifelse {
    public static void main(String[] args) {
        System.out.print("Enter your age here:");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("You are an adult and you can vote");
        } else if (age <= 17) {
            System.out.println("You are unable to vote");
        } else if (age <= 10) {
            System.out.println("You are in school");
        } else {
            System.out.println("Invalid Input");
        }
    }
}