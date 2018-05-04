import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Allow user to type a number between 1-100
        System.out.println("FizzBuzz Game. Enter number between 1-100");

        Scanner input = new Scanner(System.in);
        input.hasNext();
        String line = input.nextLine();

        FizzBuzz fizzBuzz = new FizzBuzz();

        // validate line input is numeric
        boolean Validate = fizzBuzz.ValidateDataType(line);

        if(Validate) {
            fizzBuzz.PrintNumbers(Integer.parseInt(line));
            System.exit(0);
        } else {
            System.out.print("Invalid input");
            System.exit(0);
        }

    }
}
