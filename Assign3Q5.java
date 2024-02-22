public class Assign3Q5 {
    public static void main(String args[]) {
        int currentValue = 5;
        System.out.println("The number is: " + currentValue);
        int factorial = 1;
        int fact = 1;
        while (fact <= currentValue) {
            factorial *= fact;
            System.out.println("The factorial of " + currentValue + " is: " + factorial);
            fact++;
        }
    }
}
