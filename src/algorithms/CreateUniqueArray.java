/**
 * This class creates a unique array of random integers
 * 
 * @author Bobby Gabriel
 * @version 1.0
 * Algorithms Final Project
 * Algorithms/Fall 2022
 *
 */
package algorithms;

import java.util.Random;

public class CreateUniqueArray {
	
	/*
	 * @param randomRange is the range of values each number in the array can be.
	 * @param n is the length of the array
	 * 
	 * randomRange cannot be smaller than n because there would not be enough numbers to fill the array
	 */
	protected int[] createArray(int randomRange, int n){
        Random rand = new Random();
        int[] arr = new int[n];
        for(int i=0; i < n; i++){
            arr[i] = rand.nextInt(randomRange);   
            for (int j = 0; j < i; j++){
                if (arr[i] == arr[j]){
                    i--;
                }
            }
        }
        
        //return the array;
        return arr;
        
    }//end createArray
	
}//end class
