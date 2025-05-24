import java.util.*;

public class solidRectangle {
    public static void main(String[] args) {
        System.out.print("How much rows you want in rectangle?:");
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        System.out.print("How much colums you want in the rectangle?:");
        Scanner sc1 = new Scanner(System.in);
        int cols = sc1.nextInt();
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                String colDesign = "[]";
                System.out.print(colDesign);
            }
            System.out.println();
        }
    }
}
