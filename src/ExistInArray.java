import java.util.Scanner;
import java.util.stream.IntStream;

public class ExistInArray {
    public static void main(String[] args) {

        //create and initialise and integer array, pre-fill with values of your choosing
        int[] numbers = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24};

        //ask the user to enter an integer value to search for in my array
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a number: ");
        //Output the user number
        int userNumber = reader.nextInt();

        int valueFind = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (userNumber == numbers[i]) {
                valueFind++;
            }
        }
            /*Output
If the value exists, output “Value X found in array” otherwise, output “Value was not found in array”.
*/
        if (valueFind != 0) {
            System.out.println("Value " + userNumber + " found in array");
        } else
            System.out.println("Value was not found");
    }
}

