import java.util.*;

public class switchCase {

    public static void main(String[] args) {
        try {
            System.out.println("Enter the number between 1 to 7:");
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            switch (num) {
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuseday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                case 7:
                    System.out.println("Sunday");
                    break;
                default:
                    System.out.println("Invalid Input");
                    break;
            }
        } catch (Exception e) {
            System.out.println("Some error occured:" + e);
        }
    }
}