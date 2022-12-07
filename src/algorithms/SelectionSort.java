/**
 * This class sorts an array of integers using Selection Sort
 * 
 * @author Bobby Gabriel
 * @version 1.0
 * Algorithms Final Project
 * Algorithms/Fall 2022
 *
 */
package algorithms;

import java.util.Arrays;

public class SelectionSort {
    
	
	/*
	 * Sorts an array using Selection Sort
	 * @param arr[] is an array of unique random integers
	 */
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
        
        //return the sorted array
        return arr;
        
    }//end sort

	
	
	/*
	 * Tracks the number of comparisons in the selection sort and prints to the console
	 * @param arr[] is the same input as the array in sort()
	 */
    protected void comparisons(int arr[]){
        int n = arr.length;
        int numberOfComparisons = ((n + 1) * (n/2));
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
