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

}
