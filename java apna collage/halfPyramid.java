import java.util.*;

public class halfPyramid {
    public static void main(String[] args) {
        System.out.println("Enter the height of the triagngular pyramid:");
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("Made a triangular pyramid with height of " + height);
        sc.close();
    }
}
