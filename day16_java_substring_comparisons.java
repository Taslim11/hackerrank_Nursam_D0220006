import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);
        
        int index = s.length()-k;
        
        for (int i=0; i<=index;i++) {
            String x = s.substring(i, i+k);
            
            if (smallest.compareTo(x)>0) {
                smallest = x;
            }
            
            if (largest.compareTo(x)<0) {
                largest = x;
            }
        }
        
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        
        return smallest + "\n" + largest;
    }

