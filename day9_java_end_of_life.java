import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 1;
        while (sc.hasNext()) {// hasNext() utk mendeteksi EOF
            String s = sc.nextLine();
            System.out.println(a+" "+s);
            a++;
        }
    }
}
