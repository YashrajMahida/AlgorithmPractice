package JavaPrograms;

/**
 * Created by Yashraj on 4/1/2017.
 */
public class fibonacci {

        public static long FibUsingRecursion(int i){
            if (i == 0) return 0;
            if (i <= 2) return 1;

            long FibTerm = FibUsingRecursion(i-1) + FibUsingRecursion(i-2);
            return FibTerm;
        }

    public static void main(String[] args) {
            for (int index = 0; index <= 10; index++){
                System.out.println(FibUsingRecursion(index));
            }
    }
}