import java.util.*;

public class hollowRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String green = "\u001B[32m";
        String blue = "\u001B[34m";
        String reset = "\u001B[0m";
        System.out.print("How many rows do you want?: ");
        int rows = sc.nextInt();

        System.out.print("How many columns do you want?: ");
        int cols = sc.nextInt();

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                if (i == 1 || i == rows) {
                    System.out.print(blue+"- "+reset);
                } else if(j == 1 || j == cols){
                    System.out.print(green + "| "+ reset);
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
