package DataStructures;

import java.util.HashSet;

/**
 * Created by Yashraj on 4/9/2017.
 * Create an empty hash table.
 2) Iterate through the first set and store every element in hash table.
 3) Iterate through second set and check if any element is present in hash table. If present, then return false, else ignore the element.
 4) If all elements of second set are not present in hash table, return true.
 Time complexity of the above implementation is O(m+n) under the assumption that hash set operations like add() and contains() work in O(1) time.
 */
public class CheckDisjoint {

    static boolean areDisjoint(int set1[], int set2[])
    {
        // Creates an empty hashset
        HashSet<Integer> set = new HashSet<>();

        // Traverse the first set and store its elements in hash
        for (int i=0; i<set1.length; i++)
            set.add(set1[i]);

        // Traverse the second set and check if any element of it
        // is already in hash or not.
        for (int i=0; i<set2.length; i++)
            if (set.contains(set2[i]))
                return false;

        return true;
    }

    // Driver method to test above method
    public static void main (String[] args)
    {
        int set1[] = {10, 5, 3, 4, 6};
        int set2[] = {8, 7, 9, 3};
        if (areDisjoint(set1, set2))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
