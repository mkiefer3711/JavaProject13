// @author Maddison Kiefer

import java.util.ArrayList;
import java.util.Comparator;

// This class provides a generic implementation of the Selection Sort algorithm
public class SelectionSort {
    // The sort method performs in-place selection sort on the input ArrayList using the provided comparator
    public static <T> void sort(ArrayList<T> list, Comparator<? super T> comparator) {
        // Get the size of the list
        int n = list.size();
        
        // Iterate through the list, up to the second-to-last element
        for (int i = 0; i < n - 1; i++) {
            // Assume the current index is the minimum index
            int minIndex = i;
            
            // Iterate through the unsorted portion of the list to find the index of the minimum element
            for (int j = i + 1; j < n; j++) {
                // Compare elements using the provided comparator
                if (comparator.compare(list.get(j), list.get(minIndex)) < 0) {
                     // If the current element is smaller, update the minimum index
                    minIndex = j;
                }
            }
            // Swap the minimum element with the element at the current index
            T temp = list.get(minIndex);
            list.set(minIndex, list.get(i));
            list.set(i, temp);
        }
    }
}
