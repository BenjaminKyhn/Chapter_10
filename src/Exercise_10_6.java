public class Exercise_10_6 {
    public static void main(String[] args) {
        StackOfIntegers stack = new StackOfIntegers();

        for (int i = 2; i <= 120; i++) {
            if (isPrime(i))
            stack.push(i);
        }

        while (!stack.empty())
            System.out.print(stack.pop() + " ");
    }

    public static boolean isPrime(int value){
        for (int divisor = 2; divisor <= value/2; divisor++) {
            if (value % divisor == 0)
                return false;
        }
        return true;
    }
}
