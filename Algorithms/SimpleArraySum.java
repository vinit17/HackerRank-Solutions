import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SimpleArraySum
{

    static int simpleArraySum(int n, int[] ar)
	{
        // Complete this function
        int sum = 0;
        for(int i=0;i<=n-1;i++)
	{
            sum=sum+ar[i];
       	}
	    return sum;
	}
    

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++)
	{
            ar[ar_i] = in.nextInt();
        }
        int result = simpleArraySum(n, ar);
        System.out.println(result);
    }
}
