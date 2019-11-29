import java.util.Scanner;

public class Exercise_10_5 {
    public static void main(String[] args) {
        // Create a new stack object
        StackOfIntegers stack = new StackOfIntegers();

        // Read an input
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer to be divided into factors: ");

        // Find the smallest factors
        smallestFactors(input.nextInt(), stack);

        // Print the stack from the top
        while (!stack.empty())
            System.out.print(stack.pop() + " ");
    }

    // Method for finding smallest factors and pushing them to the stack
    public static void smallestFactors(int number, StackOfIntegers stack){
        int index = 2; // to be tested as factor
        while (number / index != 1){
            if (number % index == 0){
                stack.push(index); // push the index to the stack
                number /= index;
            }
            else
                index++; // increase the prime factor
        }
        stack.push(number); // push the number to the stack
    }
}
