package JavaPrograms;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by Yashraj on 4/6/2017.
 */
public class ArraySorting {

    public static void main(String[] args) {
    int[] a = {2,8,9,5,7,6,3,1,4,2,3,5};
        Arrays.sort(a);
        for (int i =0; i<a.length; i++){
        System.out.print(a[i]);
        }

    }
}
