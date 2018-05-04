import java.util.ArrayList;

public class FizzBuzz {

    public boolean ValidateDataType(String input){
        try
        {
            Integer.parseInt(input);
        }
        catch(NumberFormatException ex){
            return false;
        }
        return true;
    }

    public ArrayList<Integer> PrintNumbers(int input){

        ArrayList<Integer> ListResult = new ArrayList<Integer>();

        int Count = 0;

        // method to print number
        for(int i = 0 ; i < input ; i++){
            Count += 1;
            ListResult.add(Count);
            System.out.println(Count);
            };
        return ListResult;
    }

    public ArrayList<String> PrintsFizzBuzz(int input){

        ArrayList<String> ListResult = new ArrayList<String>();

        int Count = 0;
        String Numbers = "";

        // method to print Fizz, Buzz and numbers
        for(int i = 0 ; i < input ; i++){

            Count += 1;

            //method to print buzz fizz
            if(Count % 3 == 0 && Count % 5 == 0) {
                ListResult.add("FizzBuzz");
                System.out.println("FizzBuzz");
            }
            //method to print fizz
            else if(Count % 3 == 0) {
                ListResult.add("Fizz");
                System.out.println("Fizz");
            }
            //method to print buzz
            else if(Count % 5 == 0) {
                ListResult.add("Buzz");
                System.out.println("Buzz");
            }
            else
                {
                Numbers = String.valueOf(Count);
                ListResult.add(Numbers);
                System.out.println(Count);
            }
        };
        return ListResult;
    }
}
