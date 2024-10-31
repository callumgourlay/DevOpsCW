import java.util.Scanner;

class Dec2Hex {
    // Static variable to store the input argument
    public static int Arg1;

    public static void main(String args[]) {
        // Check if any input argument is provided
        if (args.length == 0) {
            System.err.println("Error: No input argument provided.");
            return;
        }

        try {
            // Parse the input argument to an integer
            Arg1 = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            // Handle the case where the input argument is not a valid integer
            System.err.println("Error: Input argument is not a valid integer.");
            return;
        }

        // Array of characters representing hexadecimal digits
        char ch[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        int rem, num;
        num = Arg1; // Initialize num with the input argument
        String hexadecimal = ""; // String to store the hexadecimal representation
        System.out.println("Converting the Decimal Value " + num + " to Hex...");

        // Loop to convert decimal to hexadecimal
        while (num != 0) {
            rem = num % 16; // Get the remainder when num is divided by 16
            hexadecimal = ch[rem] + hexadecimal; // Prepend the corresponding hex digit to the result
            num = num / 16; // Update num by dividing it by 16
        }

        // Print the hexadecimal representation
        System.out.println("Hexadecimal representation is: " + hexadecimal);
    }
}
