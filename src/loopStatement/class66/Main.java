package loopStatement.class66;

public class Main {
    public static void main(String[] args) {
        int number = 4;
        int finishNumber = 20;

        int evenCount = 0;
        int oddCount = 0;

        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)) {
                oddCount++;
                continue;
            }
            System.out.println(number);
            evenCount++;
            if (evenCount >= 5) {
                break;
            }
        }

        System.out.println("Total odd numbers: " + oddCount + " even numbers: " + evenCount);
    }

    public static boolean isEvenNumber(int number) {
        if (number < 0) {
            return false;
        } else if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
