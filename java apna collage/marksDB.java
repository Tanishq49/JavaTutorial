import java.util.*;

public class marksDB{
    public static void main(String[] args){
    try{
        System.out.print("Enter the number of subjects here to store:");
        Scanner sc = new Scanner(System.in);
        int totalSubjects = sc.nextInt();
        int[] marks = new int[totalSubjects];
        for(int i = 0 ; i < marks.length; i++){
            System.out.print("Enter the marks of subject "+(i+1)+":");
            Scanner sc1 = new Scanner(System.in);
            int markInt = sc1.nextInt();
            marks[i] = markInt;
        }
        for(int j = 0 ; j < marks.length ; j++){
            System.out.println("\n \u001B[32mThe marks in subject "+(j+1) + " is " +marks[j]+"\u001B[0m \n");
        }
        
        sc.close();
    }
    catch (Exception e){
        System.out.println("\u001B[34m Some error occured:\u001B[0m \u001B[31m"+e + "\u001B[0m");
    }
}
}