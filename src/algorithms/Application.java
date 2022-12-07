/**
 * @author Bobby Gabriel
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
		// Creating the Unique array to be used for the selection sort
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

        // Returns the execution time
        System.out.println("Execution time: " + duration + "ms");





        // ------------  SHELL SORT ------------
        System.out.println("\nShell Sort");
        ShellSort shell = new ShellSort();

        startTime = System.nanoTime();
        int shellSortedArray[] = shell.sort(randomArray);
        endTime = System.nanoTime();
        duration = (endTime - startTime)/1000000;
        
        // Prints the sorted array
        //shell.printArray(shellSortedArray);

        // Returns the number of iterations made in selection sort
        shell.comparisons(shellSortedArray);

        // Returns the execution time
        System.out.println("Execution time: " + duration + "ms");
	}

}
