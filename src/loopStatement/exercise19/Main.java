package loopStatement.exercise19;

public class Main {
    public static void main(String[] args) {

    }

    public class SharedDigit {
        // write code here
        public static boolean hasSharedDigit(int first, int second) {
            if ((first < 10) || (first > 99) || (second < 10) || (second > 99)) {
                return false;
            }

            int firstLastDigit = first % 10;
            int firstFirstDigit = first / 10;

            int secondLastDigit = second % 10;
            int secondFirstDigit = second / 10;

            if ((firstLastDigit == secondLastDigit) || (firstLastDigit == secondFirstDigit) || (firstFirstDigit == secondFirstDigit) || (firstFirstDigit == secondLastDigit)) {
                return true;
            } else {
                return false;
            }

        }
    }
}
