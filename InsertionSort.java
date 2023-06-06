/**
 * @author Jankee
 * @version 1.0
 * 
 * Insertion Sort for int[]
 */
//import java.util.Arrays;
import java.util.Random;
public class InsertionSort {

    public static void insertionSort(int[] arr){

        int size = arr.length;

        for (int x = 1; x < size; x++){

            //for each number in array except for arr[0]

            int key = arr[x];

            int temp = x - 1;

            while((temp > -1) && arr[temp] > key){

                //compare to previous numbers and if it's smaller, move it backwards

                arr[temp + 1] = arr[temp];

                temp--;

            }

            arr[temp + 1] = key;

        }

    }

    public static void main(String[] args){

        int[] arr = new int[100];

        Random rand = new Random();

        for(int x = 0; x < 100; x++){

            arr[x] = rand.nextInt(100);


        }

        insertionSort(arr);

        //System.out.println(Arrays.toString(arr));

    }
    
}
