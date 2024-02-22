public class Assign3Q3 {
    public static void main(String args[]) {
int currentValue = 5;
    System.out.println("The number is: "+ currentValue);
int factorial = 1;
for (int fact = 1; fact <= currentValue; fact++) {
factorial *= fact;
    System.out.println ("The factorial of " + currentValue + " is: " + factorial);
}
}
}