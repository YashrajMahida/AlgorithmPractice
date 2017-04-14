package DataStructures;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Yashraj on 4/7/2017.
 *
 * Find whether an array is subset of another array | Added Method 3
 * O(m+n) - O(m) for building the hashtable, O(1*n) for searching through the hash table.
 *
 *1) Create a Hash Table for all the elements of arr1[].
 *2) Traverse arr2[] and search for each element of arr2[] in the Hash Table. If element is not found then return 0.
 *3) If all elements are found then return 1.
 *Note that method 1, method 2 and method 4 don’t handle the cases when we have duplicates in arr2[].
 *For example, {1, 4, 4, 2} is not a subset of {1, 4, 2}, but these methods will print it as a subset.
 */
public class ArraySubsetHashing {

    public static void main(String args[])
    {
        Integer[] Array1 = {1,2,3,4,4,5,6,0};
        Set<Integer> mySet = new HashSet<>(Arrays.asList(Array1));

        int[] Array2 = {1,2,4};
        int flag=0;

        for(int i=0;i<Array2.length;i++)
        {
            if(!mySet.contains(Array2[i]))
            {
                flag=1;
                break;
            }
        }
        if(flag==0)
        {
            System.out.println("Its a Subset");
        }
        else
        {
            System.out.println("Its not a Subset");
        }

    }
}
