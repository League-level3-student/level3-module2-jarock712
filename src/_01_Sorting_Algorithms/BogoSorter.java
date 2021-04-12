package _01_Sorting_Algorithms;

import java.util.Iterator;
import java.util.Random;

public class BogoSorter extends Sorter {
    public BogoSorter() {
        type = "Bogo";
    }

    /*
     * Bogo sort is a joke sorting algorithm. It is considered the most
     * inefficient sorting algorithm while still maintaining the possibility
     * of eventually sorting data.
     * 
     * It works by following these steps:
     * STEP 1. Is the array in order?
     * if yes, finished; if no, go to step 2.
     * STEP 2. Take two random elements in the array and swap them.
     * STEP 3. Go back to step 1.
     */
    @Override
    void sort(int[] array, SortingVisualizer display) {
        int num = array[0];
        int nums = 0;
        int order = 0;
        
        while(true) {
        	display.updateDisplay();
        	for (int i = 1; i < array.length; i++) {
				if (num <= array[i]) {
					num = array[i];
					nums++;
				}
			}
        	if (nums == array.length - 1) {
				order++;
			}
        	if (order != array.length) {
        		Random ran = new Random();
				int ran1 = ran.nextInt(array.length);
				int ran2 = ran.nextInt(array.length);
				int bog = array[ran1];
				array[ran1] = array[ran2];
				array[ran2] = bog;
			}else if(order == array.length) {
				break;
			}
        }
    }
}
