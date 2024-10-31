import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class Dec2HexTest {

    @Test
    void testNoArguments() {
        // Redirect the standard error stream to capture error messages
        ByteArrayOutputStream errContent = new ByteArrayOutputStream();
        System.setErr(new PrintStream(errContent));

        // Call the main method with no arguments
        Dec2Hex.main(new String[]{});

        // Verify that the correct error message is printed
        assertEquals("Error: No input argument provided.\n", errContent.toString());
    }

    @Test
    void testNonIntegerArgument() {
        // Redirect the standard error stream to capture error messages
        ByteArrayOutputStream errContent = new ByteArrayOutputStream();
        System.setErr(new PrintStream(errContent));

        // Call the main method with a non-integer argument
        Dec2Hex.main(new String[]{"abc"});

        // Verify that the correct error message is printed
        assertEquals("Error: Input argument is not a valid integer.\n", errContent.toString());
    }

    @Test
    void testValidIntegerArgument() {
        // Redirect the standard output stream to capture output messages
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Call the main method with a valid integer argument
        Dec2Hex.main(new String[]{"255"});

        // Define the expected output
        String expectedOutput = "Converting the Decimal Value 255 to Hex...\nHexadecimal representation is: FF\n";
        
        // Verify that the correct output is printed
        assertEquals(expectedOutput, outContent.toString());
    }
}