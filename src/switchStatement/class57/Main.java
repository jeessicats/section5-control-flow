package switchStatement.class57;

public class Main {
    public static void main(String[] args) {
        int switchValue = 4;
        switch (switchValue) {
            case 1:
                System.out.println("1");
                break;
            case 2: System.out.println("2");
                break;
            case 3: System.out.println("3");
                break;
            default: {
                System.out.println("It's not 1, 2 or 3.");
            }
        }
    }
}
