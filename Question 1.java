/*Question 1:
Write a Java program that demonstrates the use of variables and data types.

The program should use variables of different data types (int, double, char, boolean, String)
and perform basic operations such as addition, subtraction, multiplication, and string concatenation.
Clarifications:
        2. Declare variables of different data types (e.g., int, double, char, boolean, String).
        3. Perform basic arithmetic operations using numeric data types (int and double).✅
        4. Concatenate strings using the String variable and display the result.
        5. Display the results of all operations.
 */
public class Assignment1
{
    public static void main(String[] args) {
        int a = 6;
        int b = 9;
        char ch = 'A';
        String Firstname = "Pushkar";
        String LastName = "Singh Baghel";
        int result = a + b;
        int result1 = a - b;
        int result2 = a * b;
        double value = (double) a / (double) b;
        System.out.println("Sum = "+result);
        System.out.println("Subtraction = " + result1);
        System.out.println("Multiplication = "+result2);
        System.out.println("division = "+value);
        String FullName = Firstname+" "+LastName;
        System.out.println(FullName);
    }
}
