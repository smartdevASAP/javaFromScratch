import java.util.Scanner; // Import the Scanner class to read user input

public class hello {

    // The main method is the entry point for the Java application
    public static void main(String[] args) {
        
        // 1. Print "Hello world!"
        System.out.println("Hello world!");

        // 2. Set up the Scanner to read input from the console
        Scanner scanner = new Scanner(System.in);

        // 3. Prompt the user for their name
        System.out.print("What is your name? ");
        
        // 4. Read the user's input (a line of text)
        String name = scanner.nextLine();

        // 5. Print the personalized greeting
        System.out.println("Hello " + name);

        // Close the scanner when done to free up resources
        scanner.close();
    }
}