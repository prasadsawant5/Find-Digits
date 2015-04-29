import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        long num, temp;
        int digit, count = 0;
        
        for (int i  = 0; i < t; i++) {
            num = sc.nextLong();
            temp = num;
            
            for (int j = 0; j < String.valueOf(num).length(); j++) {
                digit = (int) temp % 10;
                
                if (digit != 0) {
                    if (num % digit == 0) {
                    count++;
                    }
                }
                
                temp /= 10;
            }
            
            System.out.println(count);
            count = 0;
            
        }
        
        
    }
}
