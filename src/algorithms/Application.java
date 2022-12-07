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

public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Creating the Unique array to be used for the selection sort and shell sort
        CreateUniqueArray c = new CreateUniqueArray();
        int randomArray[] = c.createArray(950, 800);




        // ------------  SELECTION SORT ------------
        System.out.println("Selection Sort");
        SelectionSort s = new SelectionSort();

        // Tracking the wall-clock time of the given selection sort
        long startTime = System.nanoTime();
        int selectionSortedArray[] = s.sort(randomArray);
        long endTime = System.nanoTime();
        long duration = (endTime - startTime)/1000000;

        // Prints the sorted array
        //s.printArray(selectionSortedArray);

        // Returns the number of iterations made in selection sort
        s.comparisons(selectionSortedArray);

        // Displays the wall-clock time
        System.out.println("Execution time: " + duration + "ms");





        // ------------  SHELL SORT -------------
        System.out.println("\nShell Sort");
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

        // Returns the wall-clock time
        System.out.println("Execution time: " + duration + "ms");
        
	}//end main

}//end class
