import java.math.*;
import java.util.Scanner;

public class Listing_10_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int n = input.nextInt();
        System.out.println(n + "! is \n" + factorial(n));
    }

    public static BigInteger factorial(long n){
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= n; i++)
            result = result.multiply(new BigInteger(i + ""));

        return result;
    }
}
