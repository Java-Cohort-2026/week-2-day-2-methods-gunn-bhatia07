public class Main {
    
    public static void main(String[] args) {
        // --- TEST ROOM ---
        // Do not change these variables. The auto-grader will modify them!
        double testCelsius = 0.0;
        double testFahrenheit = 32.0;

        // Calling your methods
        double resultF = celsiusToFahrenheit(testCelsius);
        double resultC = fahrenheitToCelsius(testFahrenheit);

        // --- OUTPUT ---
        System.out.println(testCelsius + "C is " + resultF + "F");
        System.out.println(testFahrenheit + "F is " + resultC + "C");
    }

    // --- YOUR MISSION ---
    
    // TODO: Create a method named 'celsiusToFahrenheit'
    // It should take a double parameter, and return a double.
    // Formula: (C * 9/5) + 32
    
    
    // TODO: Create a method named 'fahrenheitToCelsius'
    // It should take a double parameter, and return a double.
    // Formula: (F - 32) * 5/9

}
