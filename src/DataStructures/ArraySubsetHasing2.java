package DataStructures;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Yashraj on 4/7/2017.
 *
 * Find whether an array is subset of another array | Added Method 3
 *
 */
public class ArraySubsetHasing2 {
    public static void main (String[] args) {
        System.out.println(subArrayOfAnotherArray(new int[]{1,3,5,7,4,2},new int[]{1,3,4,2}));
    }
    private static boolean subArrayOfAnotherArray(int[] arr1,int[] arr2){

        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int a : arr2){
            if(null == map.get(a)){
                map.put(a, 1);
            }else{
                map.put(a, map.get(a) + 1);
            }
        }

        for(int a : arr1){
            Integer val = map.get(a);
            if(val !=null){
                if((val - 1) > 0 ){
                    map.put(a, val -1);
                }else{
                    map.remove(a);
                }
            }
        }
        return map.isEmpty();
    }
}
