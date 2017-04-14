package JavaPrograms; /**
 * Created by Yashraj on 4/1/2017.
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FrequencyOfRepeatingChar {
    public void findDuplicateChars(String str){

        Map<Character, Integer> dupMap = new HashMap<Character, Integer>();
        char[] chrs = str.toCharArray();
        for(Character ch:chrs){
            if(dupMap.containsKey(ch)){
                dupMap.put(ch, dupMap.get(ch)+1);
            } else {
                dupMap.put(ch, 1);
            }
        }
        Set<Character> keys = dupMap.keySet();
        for(Character ch:keys){
            if(dupMap.get(ch) > 1){
                System.out.println(ch+"--->"+dupMap.get(ch));
            }
            if(dupMap.get(ch) == 1 ){
                System.out.println("Non-repeating characters "+ch+"--->"+dupMap.get(ch));
            }
        }
    }

    public static void main(String a[]){
        FrequencyOfRepeatingChar dcs = new FrequencyOfRepeatingChar();
        dcs.findDuplicateChars("Java2Novice");
    }

}
