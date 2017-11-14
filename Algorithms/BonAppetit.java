package Solutions;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BonAppetit {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] ar = new int[n];
        int sum=0;
        
        for(int i = 0; i <= ar.length-1; i++){
            ar[i] = in.nextInt();
            if(i != k) sum += ar[i];
        }
        int b = in.nextInt();
       int cost_of_each = sum/2;
        System.out.println(cost_of_each==b? "Bon Appetit": b-cost_of_each);
        in.close();
    }
}