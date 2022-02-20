import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        s = s.replaceAll("[!,?._'@\\s]+", " ");
        String[] result = s.split("\\s");
        int n = result.length;
        System.out.println(n);
        for (String myString : result) {
            System.out.println(myString);
        }

        // s = s.replaceAll("[!,?._'@\\s]+", " ");
        // StringTokenizer token = new StringTokenizer(s);
        // int n = token.countTokens();
        // System.out.println(n);

        // while(token.hasMoreTokens()){
        // System.out.println(token.nextToken());
        // }
        // for(int i = 0; i<n; i++){
        // System.out.println(token.nextToken());
        // }

        scan.close();
    }
}
