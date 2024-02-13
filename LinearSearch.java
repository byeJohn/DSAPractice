//import java.util.*;

public class LinearSearch
{
    public static void main(String [] args){

        // intialize groceries
        String[] groceries = {"apples", "chips", "bananas", "cucumbers","bread"};

        //print length of array
        System.out.println("Number of groceries: " + groceries.length);

        //print all groceries
        for(String item : groceries){
            System.out.print(item + ", ");
        }
        System.out.println();

        //rerieve element in constant time
        System.out.println("Grocery item at index 3: " + groceries[3]);

        //remove element
        groceries[3] = null;

        //check length
        System.out.println("Number of groceries: " + groceries.length);

        //print all elements again
        for(String item : groceries){
            System.out.print(item + ", ");
        }

    }
}