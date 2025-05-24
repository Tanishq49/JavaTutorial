import java.util.*;

public class hollowRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many rows do you want?: ");
        int rows = sc.nextInt();

        System.out.print("How many columns do you want?: ");
        int cols = sc.nextInt();

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                if (i == 1 || i == rows) {
                    System.out.print("- ");
                } else if(j == 1 || j == cols){
                    System.out.print("| ");
                } 
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        sc.close();
    }
}
