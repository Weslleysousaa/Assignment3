public class Assign3Q2 {
    public static void main(String[] args) {
        String currentMonth = "February";
        System.out.println("The current month is: " + currentMonth);
        switch (currentMonth) {
            case "January":
                System.out.println("31 days");
                break;
                case "February":
                System.out.println("29 days");
                break;
            case "march":
                System.out.println("30 days");
                break;
            default:
                System.out.println("Invalid month");
                break;
        }
    }
}