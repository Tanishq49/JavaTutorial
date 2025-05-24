import java.util.*;

public class invertedHalfPyramid {
    public static void main(String[] args){
        System.out.print("Enter the height of the pyramid:");
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();
         for (int i = height; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
