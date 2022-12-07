/**
 * @author Bobby Gabriel
 *
 */
package algorithms;

import java.util.Random;

public class CreateUniqueArray {
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
        
        //return arr;
        return arr;
    }
}
