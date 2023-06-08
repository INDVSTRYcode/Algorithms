/**
 * @author Jankee
 * @version 1.0
 * 
 * Linear Search for int[]
 * entirely for time comparison purposes
 */
import java.util.Arrays;
import java.util.Random;

public class LinearSearch {

    public static int linearSearch(int[] arr, int target){

        int found = -1; //int to be returned

        for(int x = 0; x < arr.length; x++){

            //iterate through whole array comparing each number to target

            if (arr[x] == target){

                found = target;

            }
        }

        return found;

    }

    public static void main(String[] args){

        int[] arr = new int[100];

        Random rand = new Random();

        for(int x = 0; x < 100; x++){

            arr[x] = rand.nextInt(100);

            System.out.print(arr[x] + " ");

        }

        System.out.println();

        System.out.println(linearSearch(arr, Integer.parseInt(args[0])));

    }
    
}
