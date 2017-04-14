package DataStructures;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by Yashraj on 4/8/2017.
 *
 * Check if an array can be divided into pairs whose sum is divisible by k
 *
 * An Efficient Solution is to use Hashing.

 1) If length of  given array is odd, return false. An odd
 length array cannot be divided in pairs.
 2) Traverse input array array and count occurrences of
 all remainders.
 freq[arr[i] % k]++
 3) Traverse input array again.
 a) Find remainder of current element.
 b) If remainder divides k into two halves, then
 there must be even occurrences of it as it forms
 pair with itself only.
 c) If remainder is 0, then then there must be even
 occurrences.
 c) Else, number of occurrences of current remainder
 must be equal to number of occurrences of "k -
 current remainder".

 Time complexity of above algorithm is O(n).
 *
 */
public class PairSumDivisibleByK {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int arr[] = {9, 7, 5, 3};
        int k = 6;
        System.out.println(isArrayDivided(arr,k));
    }

    private static boolean isArrayDivided(int[] arr, int k) {
        int len = arr.length;
        if(len%2!=0)
            return false;

        Set<Integer> set = new HashSet<>();
        for(int i : arr){
            set.add(i%k);
        }

        for(int i : arr){
            if(i%k!=0 && !set.contains(k - i%k))
            {
                return false;
            }
        }
        return true;
    }
}
