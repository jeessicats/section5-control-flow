package switchStatement.class59;

public class Main {
    public static void main(String[] args) {
        char charValue = 'E';
        switch (charValue) {
            case 'A':
                System.out.println("A is Able");
                break;
            case 'B':
                System.out.println("B is Baker");
                break;
            case 'C':
                System.out.println("C is Charlie");
                break;
            case 'D':
                System.out.println("D is Dog");
                break;
            case 'E':
                System.out.println("E is Easy");
                break;
            default:
                System.out.println("Letter " + charValue + " was not found in the list");
        }
    }
}
