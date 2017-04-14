package JavaPrograms; /**
 * Created by Yashraj on 4/1/2017.
 */
import java.io.*;
import java.util.*;

public class reverseString {
    public static void main(String[] args) {
        String input = "Be in present";
        char[] temparray= input.toCharArray();
        int left,right=0;
        right=temparray.length-1;
        for (left=0; left < right ; left++ ,right--)
        {
            // Swap values of left and right
            char temp = temparray[left];
            temparray[left] = temparray[right];
            temparray[right]=temp;
        }
        for (char c : temparray)
            System.out.print(c);
        System.out.println();
    }
}
