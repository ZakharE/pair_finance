package pair.finance;

import java.util.HashMap;
import java.util.Map;

public class FindMajority {
   public static int findMajority(int[] a) {
        Map<Integer, Integer> counter = new HashMap<>();
        int maxCounter = 0;
        int maxElement = 0;
        for (int entry : a) {
            Integer newVal =counter.compute(entry, (k, v) -> v== null ? 1: v + 1);
            if (newVal > maxCounter) {
                maxCounter = newVal;
                maxElement = entry;
            }
        }
        return maxElement;
    }
}
