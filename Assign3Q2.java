Assign3Q2.java
public static void main(String args[]) {
   int currentMonth = 2;
   int daysInMonth;
   switch (currentMonth) {
            case 1: // January
                daysInMonth = 31;
                break;
            case 11: // November
                daysInMonth = 30;
                break;
            case 2: // February
                daysInMonth = 28; // Assuming non-leap year
                break;
            default:
                System.out.println("Invalid month.");
                return; // Exit the program if the month is invalid
        }

        System.out.println("Number of days in the current month: " + daysInMonth);
        }
    }
