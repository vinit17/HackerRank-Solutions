package Solutions;

import java.io.*;
import java.util.*;

public class PlusMinus {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        
        int[] a = new int[size];
        
        double fractionPositive = 0;
        double fractionZero = 0;
        double fractionNegative = 0;
        
        for (int i = 0; i < size; i++){
            a[i] = scanner.nextInt();
            if (a[i] > 0) fractionPositive += 1;
            else if (a[i] == 0) fractionZero += 1;
            else if (a[i] < 0) fractionNegative += 1;
        }
        
        System.out.printf("%.6f %n",fractionPositive/size);
        System.out.printf("%.6f %n",fractionNegative/size);
        System.out.printf("%.6f %n",fractionZero/size);
        
    }
}