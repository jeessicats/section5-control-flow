package loopStatement.class62;

public class Main {
    public static void main(String[] args) {

        int counter = 0;

        for (int i = 10; counter < 3 && i <= 50; i++) {
            if (isPrime(i)) {
                System.out.println("Number " + i + " is prime number");
                counter++;
                }
        }
    }
    public static boolean isPrime(int wholeNumber) {
        if (wholeNumber <= 2) {
            return (wholeNumber == 2);
        }

        for (int i = 2; i <= wholeNumber / 2; i++) {
            if (wholeNumber % i == 0) {
                return false;
            }
        }
        return true;
    }
}
