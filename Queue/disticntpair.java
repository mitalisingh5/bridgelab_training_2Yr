
import java.util.HashSet;
import java.util.Set;
public class disticntpair
 {
    public static void main(String[] args) {
        int[] arr = {5,1,3};
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int diff = Math.abs(arr[i] - arr[j]);
                set.add(diff);
            }
        }

        System.out.println("Distinct:" + set);
        System.out.println(set.size());
    }
}