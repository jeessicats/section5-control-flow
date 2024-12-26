package loopStatement.class63;

public class Main {
    public static void main(String[] args) {

        int counter = 0;
        int sum = 0;

        for (int i = 1; counter < 5 && i <= 1000; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println("Number " + i);
                sum += i;
                counter++;
            }
            if (counter == 5) {
                break;
            }
        }

        System.out.println("Sum of first 56 numbers divisible by 3 and 5: " + sum);
    }
}

