import java.util.*;

public class loops {
    public static void main(String[] args) {

        System.out.print("Enter any 1st word here:");

        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();

        for (int i = word.length(); i < word.length(); i--) {
            System.out.println(word.charAt(i));
        }
    }
}
