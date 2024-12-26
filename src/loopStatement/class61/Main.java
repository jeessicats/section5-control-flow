package loopStatement.class61;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        for (double rate = 2.0 ; rate <= 5.0; rate++) {
            double interestAmount = calculateInterests(1000.0, rate);
            System.out.println("10000.0 at " + rate + "% interest is " + interestAmount);
        }

        for (double rate = 7.25 ; rate <= 10.0; rate += 0.25) {
            double interestAmount = calculateInterests(100.0, rate);
            if (interestAmount > 8.5) {
                break;
            }
            System.out.println("100.0 at " + rate + "% interest is " + interestAmount);
        }
    }

    public static double calculateInterests(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }
}
