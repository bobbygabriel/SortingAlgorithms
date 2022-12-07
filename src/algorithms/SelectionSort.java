/**
 * 
 */
package algorithms;

/**
 * @author Bobby Gabriel
 *
 */
import java.util.Arrays;

public class SelectionSort {
    protected int[] sort(int arr[]){
        int n = arr.length;

        for(int i = 0; i < n-1; i++){
            int min_index = i;
            for(int j = i + 1; j < n; j++){
                if(arr[j] < arr[min_index]){
                    min_index = j;
                }
            }

            int temp = arr[min_index];
            arr[min_index] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

    protected void comparisons(int arr[]){
        int n = arr.length;
        int numberOfComparisons = ((n + 1) * (n/2));
        System.out.println("Number of comparisons: " + numberOfComparisons);
        
    }

    protected void printArray(int arr[]){
        System.out.println(Arrays.toString(arr));
    }
}
