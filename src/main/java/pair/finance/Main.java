package pair.finance;

import static pair.finance.FindMajority.findMajority;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,2};
        int result = findMajority(nums);
        System.out.println("Majority Element: " + result);
    }


}