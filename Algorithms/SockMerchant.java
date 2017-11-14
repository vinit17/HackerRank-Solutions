package Solutions;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SockMerchant {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        int count = 0;
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        Arrays.sort(ar);
        for(int i=0;i<n-1;i++){
            if(ar[i]==ar[i+1]) count+=1;
            i++;
        }
        System.out.println(count);
    }
}
