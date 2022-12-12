/**
 * This class will test each sorting algorithm with an input of an array of unique number. 
 * This class also measure the wall-clock time of each sorting algorithm.
 * 
 * @author Bobby Gabriel
 * @version 1.0
 * Algorithms Final Project
 * Algorithms/Fall 2022
 *
 */

package algorithms;

import java.util.Arrays;

public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
        CreateUniqueArray c = new CreateUniqueArray();

        System.out.println("-----Differences in Creating a Unique Random Array-----");

        // 2 examples to show wall-clock time difference on having a large gap vs small gap with randomRange and array length
        long startTime = System.nanoTime();
        c.createArray(10000, 10000);
        long endTime = System.nanoTime();
        long duration = (endTime - startTime)/1000000;
        //System.out.println(Arrays.toString(example));
        System.out.println("Array Size 10,000 with Range of 10,000");
        System.out.println("Execution time: " + duration + "ms\n");
        
        
        startTime = System.nanoTime();
        c.createArray(100000, 10000);
        endTime = System.nanoTime();
        duration = (endTime - startTime)/1000000;
        //System.out.println(Arrays.toString(example));
        System.out.println("Array Size 10,000 with Range of 100,000");
        System.out.println("Execution time: " + duration + "ms");
        System.out.println("\n\n");
        
        
        
        // Creating the unique array to be used for both Selection sort and Shell sort
        // Also measuring the time it takes to complete so it can be added to the total execution time of the sorting algorithms
        long totalArrayStartTime = System.nanoTime();
        
        int randomRange = 200000;
        int n = 100000;
        int randomArray[] = c.createArray(randomRange, n);
        
        long totalArrayEndTime = System.nanoTime();
        long totalArrayDuration = (totalArrayEndTime - totalArrayStartTime)/1000000;
        System.out.println("-----Sorting Algorithms with array size: " + n + " and range: " + randomRange + " -----\n");


        
        
        
        
        
        // ------------  SELECTION SORT ------------
        System.out.println("-----Selection Sort-----");
        SelectionSort s = new SelectionSort();

        // Tracking the wall-clock time of the given selection sort
        startTime = System.nanoTime();
        int selectionSortedArray[] = s.sort(randomArray);
        endTime = System.nanoTime();
        duration = (endTime - startTime)/1000000;

        // Prints the sorted array
        //s.printArray(selectionSortedArray);

        // Returns the number of iterations made in selection sort
        s.comparisons(selectionSortedArray);

        // Calculates time to create the array + run the sorting algorithm
        long totalDuration = duration + totalArrayDuration;
        
        // Displays the wall-clock time
        System.out.println("Execution time: " + duration + "ms");
        System.out.println("Execution time including the creation of the array: " + totalDuration + "ms");
        System.out.println("\n");

        
        

        
        // ------------  SHELL SORT -------------
        System.out.println("-----Shell Sort-----");
        ShellSort shell = new ShellSort();

        // Tracking the wall-clock time of the given selection sort
        startTime = System.nanoTime();
        int shellSortedArray[] = shell.sort(randomArray);
        endTime = System.nanoTime();
        duration = (endTime - startTime)/1000000;
        
        // Prints the sorted array
        //shell.printArray(shellSortedArray);

        // Returns the number of iterations made in shell sort
        shell.comparisons(shellSortedArray);

        // Calculates time to create the array + run the sorting algorithm
        totalDuration = duration + totalArrayDuration;
        
        // Returns the wall-clock time
        System.out.println("Execution time: " + duration + "ms");
        System.out.println("Execution time including the creation of the array: " + totalDuration + "ms");
        
        
        
	}//end main

}//end class
