package switchStatement.class58;

public class Main {
    public static void main(String[] args) {
        int switchValue = 4;
        switch (switchValue) {
            case 1 -> System.out.println("1");
            case 2 -> System.out.println("2");
            case 3, 4, 5 -> {
                System.out.println("Was 3, 4 or a 5");
                System.out.println("Actually it was a: " + switchValue);
            }
            default -> System.out.println("It's not 1, 2, 3, 4 or 5");
        }
    }

    public static String getQuarter(String month) {
        return switch (month) {
            case "JANUARY", "FEBRUARY", "MARCH" -> "1ST";
            case "APRIL", "MAY", "JUNE" -> "2st";
            case "JULE", "AUGUST", "SEPTEMBER" -> "3st";
            case "OCTOBER", "NOVEMBER", "DECEMBER" -> "4th";
            default -> "Unknown";
        };
    }
}
