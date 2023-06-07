/**
 * @author Jankee
 * @version 1.0
 * 
 * Bubble Sort for int[]
 */
import java.util.Arrays;
import java.util.Random;
public class BubbleSort {

    public static void bubbleSort(int[] arr){

        int temp = 0;

        for(int x = 0; x < arr.length - 1; x++){

            //for each number in array

            for(int y = x + 1; y < arr.length; y++){

                //compare to adjacent numbers until correct position found

                if(arr[x] > arr[y]){

                    temp = arr[x];
                    arr[x] = arr[y];
                    arr[y] = temp;

                }

            }

        }

    }

    public static void main(String[] args){

        int[] arr = new int[100];

        Random rand = new Random();

        for(int x = 0; x < 100; x++){

            arr[x] = rand.nextInt(100);


        }

        bubbleSort(arr);

        System.out.println(Arrays.toString(arr));

    }
    
}
