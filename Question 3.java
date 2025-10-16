/*Question 3:
Write a Java program that uses If-Else and Nested If-Else statements to determine whether a person is eligible for voting. 
A person is eligible to vote if their age is greater than or equal to 18. Additionally, if the age is above 18,
 check whether the person has valid identification to vote. Use nested If-Else to handle these conditions.
Clarifications:
1. Use an If-Else statement to check if the person's age is 18 or greater.
2. If the person is eligible (age >= 18), use a nested If-Else to check if they have valid identification.
3. Display appropriate messages based on the conditions (eligible, not eligible, or missing ID). 
Use hardcoded input values and check all the cases of eligible, not eligible, and missing ID !*/
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
