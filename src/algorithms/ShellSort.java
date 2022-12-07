/**
 * This class sorts an array of integers using Shell Sort
 * 
 * @author Bobby Gabriel
 * @version 1.0
 * Algorithms Final Project
 * Algorithms/Fall 2022
 *
 */
package algorithms;

import java.util.Arrays;

public class ShellSort {
	int count;

	/*
	 * Sorts an array using shell sort
	 * @param arr[] is an array of unique random integers.
	 */
    protected int[] sort(int arr[]){
        int n = arr.length;
 
        // Start with a big gap, then reduce the gap
        for (int gap = n/2; gap > 0; gap /= 2)
        {
             /*
              * Do a gapped insertion sort for this gap size.
              * The first gap elements a[0..gap-1] are already in gapped order, keep adding one more element until the entire array is gap sorted
              */
            for (int i = gap; i < n; i += 1)
            {
            	/*
            	 * add a[i] to the elements that have been gap
            	 * sorted save a[i] in temp and make a hole at position 1
            	 */
                int temp = arr[i];
 
                // shift earlier gap-sorted elements up until
                // the correct location for a[i] is found
                int j;
                for (j = i; j >= gap && arr[j - gap] > temp; j -= gap)
                    arr[j] = arr[j - gap];
                    count++;
                // put temp (the original a[i]) in its correct
                // location
                arr[j] = temp;

            }
        }
        //returns the fully sorted array
        return arr;
        
    }//end sort

    
    /*
     * Tracks the number of comparisons in the shell sort and prints to the console
     * @param arr[] is the same input as the array in sort()
     */
    protected void comparisons(int arr[]){
        int numberOfComparisons = count;
        System.out.println("Number of comparisons: " + numberOfComparisons);
    }//end comparisons

    
    
    /*
     * Prints out the fully sorted array to the console
     * @param arr[] is the fully sorted array returned by sort()
     */
    protected void printArray(int arr[]){
        System.out.println(Arrays.toString(arr));
    }//end printArray
    
}//end class
