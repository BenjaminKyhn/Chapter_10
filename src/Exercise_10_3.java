public class Exercise_10_3 {
    public static void main(String[] args) {
        MyInteger myInteger = new MyInteger(107);
        MyInteger myInteger1 = new MyInteger(62);
        System.out.println(myInteger.isEven());
        System.out.println(myInteger.isOdd());
        System.out.println(myInteger.isPrime());
        System.out.println(myInteger.getValue());
        System.out.println(myInteger.isEven(50));
        System.out.println(myInteger.isOdd(50));
        System.out.println(myInteger.isPrime(50));
        System.out.println(myInteger.getValue());
        System.out.println(myInteger.isEven(myInteger));
        System.out.println(myInteger.isOdd(myInteger));
        System.out.println(myInteger.isPrime(myInteger));
        System.out.println(myInteger.equals(107));
        System.out.println(myInteger.equals(myInteger1));
        char[] chars ={'c','g','H'};
        System.out.println(myInteger.parseInt(chars));
        System.out.println(myInteger.parseInt("Dette er en string"));
    }
}

class MyInteger{
    private int value;

    public MyInteger(int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public boolean isEven(){
        return value % 2 == 0;
    }

    public boolean isOdd(){
        return value % 2 != 0;
    }

    public boolean isPrime(){
        for (int divisor = 2; divisor <= value/2; divisor++) {
            if (value % divisor == 0)
                return false;
        }
        return true;
    }

    public static boolean isEven(int value){
        return value % 2 == 0;
    }

    public static boolean isOdd(int value){
        return value % 2 != 0;
    }

    public static boolean isPrime(int value){
        for (int divisor = 2; divisor <= value/2; divisor++) {
            if (value % divisor == 0)
                return false;
        }
        return true;
    }

    public static boolean isEven(MyInteger MyInteger){
        return MyInteger.isEven();
    }

    public static boolean isOdd(MyInteger MyInteger){
        return MyInteger.isOdd();
    }

    public static boolean isPrime(MyInteger MyInteger){
        return MyInteger.isPrime();
    }

    public boolean equals(int value){
        return this.value == value;
    }

    public boolean equals(MyInteger MyInteger){
        return MyInteger.value == this.value;
    }

    public static int parseInt(char[] chars){
        int value = 0;
        for (int i = 0; i < chars.length; i++) {
            value += chars[i];
        }
        return value;
    }

    public static int parseInt(String string){
        int value = 0;
        for (int i = 0; i < string.length(); i++) {
            value += string.charAt(i);
        }
        return value;
    }
}
