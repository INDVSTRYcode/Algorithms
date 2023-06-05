/**
 * @author Jankee
 * @version 1.0
 * 
 * Binary Search for int[]
 */
import java.util.Arrays;
import java.util.Random;

public class BinarySearch {

    public static int binarySearch(int[] arr, int target){

        int found = -1; //int to be returned

        int middle;

        int low = 0;

        int high = arr.length;

        while (low <= high){

            middle = low + (high - low) / 2;

            //while there's room to iterate, calculate the middle using current highest and lowest indexes

            if (arr[middle] == target){

                found = arr[middle]; // if int is found return it

                break;

            } else if (arr[middle] < target){

                low = middle + 1; // if target is too high, remove bottom half of array from search

            } else {

                high = middle - 1; //if target is too low, remove top half of array from search

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

        Arrays.sort(arr);

        System.out.println();

        System.out.println(binarySearch(arr, Integer.parseInt(args[0])));

    }
    
}
