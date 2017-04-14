package DataStructures;

import java.util.HashMap;

/**
 * Created by Yashraj on 4/8/2017.
 * An Efficient Solution is to use the count of previous window, while sliding the window.
 * The idea is to create a hash map that stores elements of current widow.
 * When we slide the window, we remove an element from hash and add an element.
 * We also keep track of distinct elements. Below is algorithm.

 1) Create an empty hash map. Let hash map be hM

 2) Initialize distinct element count ‘dist_count’ as 0.

 3) Traverse through first window and insert elements of first window to hM. The elements are used as key and their counts as value in hM. Also keep updating ‘dist_count’

 4) Print ‘dist_count’ for first window.

 3) Traverse through remaining array (or other windows).
 ….a) Remove the first element of previous window.
 …….If the removed element appeared only once
 …………..remove it from hM and do “dist_count–”
 …….Else (appeared multiple times in hM)
 …………..decrement its count in hM

 ….a) Add the current element (last element of new window)
 …….If the added element is not present in hM
 …………..add it to hM and do “dist_count++”
 …….Else (the added element appeared multiple times)
 …………..increment its count in hM

 Time complexity of the above solution is O(n).
 */
public class DistinctElement {
    static void countDistinct(int arr[], int k)
    {
        // Creates an empty hashMap hM
        HashMap<Integer, Integer> hM = new HashMap<Integer, Integer>();

        // initialize distinct element  count for
        // current window
        int dist_count = 0;

        // Traverse the first window and store count
        // of every element in hash map
        for (int i = 0; i < k; i++)
        {
            if (hM.get(arr[i]) == null)
            {
                hM.put(arr[i], 1);
                dist_count++;
            }
            else
            {
                int count = hM.get(arr[i]);
                hM.put(arr[i], count+1);
            }
        }

        // Print count of first window
        System.out.println(dist_count);

        // Traverse through the remaining array
        for (int i = k; i < arr.length; i++)
        {

            // Remove first element of previous window
            // If there was only one occurrence, then
            // reduce distinct count.
            if (hM.get(arr[i-k]) == 1)
            {
                hM.remove(arr[i-k]);
                dist_count--;
            }
            else // reduce count of the removed element
            {
                int count = hM.get(arr[i-k]);
                hM.put(arr[i-k], count-1);
            }

            // Add new element of current window
            // If this element appears first time,
            // increment distinct element count
            if (hM.get(arr[i]) == null)
            {
                hM.put(arr[i], 1);
                dist_count++;
            }
            else // Increment distinct element count
            {
                int count = hM.get(arr[i]);
                hM.put(arr[i], count+1);
            }

            // Print count of current window
            System.out.println(dist_count);
        }
    }

    // Driver method
    public static void main(String arg[])
    {
        int arr[] =  {1, 2, 1, 3, 4, 2, 3};
        int k = 4;
        countDistinct(arr, k);
    }
}
