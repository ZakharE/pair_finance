package pair.finance;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static pair.finance.FindMajority.findMajority;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,2};
        int result = findMajority(nums);
        System.out.println("Majority Element: " + result);
    }


}