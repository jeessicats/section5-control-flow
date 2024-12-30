package loopStatement.exercise22;

public class Main {
    public static void main(String[] args) {

    }

    public class GreatestCommonDivisor {
        // write code here
        public static int getGreatestCommonDivisor(int first, int second) {
            if (first < 10 || second < 10) {
                return -1;
            }

            int min = Math.min(first, second);


            for (int i = min; i > 0; i--) {
                if (first % i == 0 && second % i == 0) {
                    return i; // Retorna o maior divisor comum
                }
            }

            return -1;
        }
    }
}
