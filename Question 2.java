/*Question 2:
Write a Java program that creates an array of integers and performs the following operations: - Assign values to the array
- Find the sum and average of the array elements
- Find the largest and smallest element in the array
Clarifications:
1. Create an array of integers.
2. Assign values to the array using a loop or direct initialization.
3. Calculate the sum and average of the array elements.
4. Find and display the largest and smallest elements in the array.
Expected Output:
Array elements: 10, 20, 30, 40, 50
Sum of array elements: 150
Average of array elements: 30
Largest element: 50
Smallest element: 10
*/
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");

        for(int i = 0; i < n; ++i) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Array elements: ");

        for(int i = 0; i < n; ++i) {
            System.out.print(arr[i]);
            if (i < n - 1) {
                System.out.print(", ");
            }
        }

        System.out.println();
        int sum = 0;

        for(int i = 0; i < n; ++i) {
            sum += arr[i];
        }

        double average = (double)sum / (double)n;
        System.out.println("Sum of array elements: " + sum);
        System.out.println("Average of array elements: " + average);
        int largest = arr[0];
        int smallest = arr[0];

        for(int i = 1; i < n; ++i) {
            if (arr[i] > largest) {
                largest = arr[i];
            }

            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }

        System.out.println("Largest element: " + largest);
        System.out.println("Smallest element: " + smallest);
        sc.close();
    }
}