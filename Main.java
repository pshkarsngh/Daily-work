import java.sql.SQLOutput;
import java.util.*;
class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Age :");
        int age = sc.nextInt();
        System.out.println("DO You have valid ID ?");
        boolean hasValidID = sc.hasNext();
        if (age >= 18) {
            System.out.println("You are old enough to vote");
            if (hasValidID) {
                System.out.println("You have valid ID");
                System.out.println("You are eligible to vote.");
            } else {
                System.out.println("You do not have valid ID");
                System.out.println("You are not allowed to vote without ID.");
            }
        } else {
            System.out.println("You are not eligible to vote");
            System.out.println("Minimum age required is 18");
        }
    }
}
