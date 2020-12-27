/*  Author : Alpha_The_Coder
    Created On 25/12/2020                           */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Permutation1 {
    public static void main(String[] args) {
        FastScanner sc=new FastScanner();
        int n=sc.nextInt();
        int[] a=sc.readArray(n);
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int maxpos=0,minpos=0;
        for (int i = 0; i <n ; i++) {
            if (a[i]>max)
            {
                max=a[i];
                maxpos=i+1;
            }
            if (a[i]<min)
            {
                min=a[i];
                minpos=i+1;
            }
        }
        int diff1=Math.abs(minpos-maxpos);
        int d2=Math.abs(n-maxpos);
        int d3=Math.abs(n-minpos);
        int d4=Math.abs(1-minpos);
        int d5=Math.abs(1-maxpos);
        System.out.println(Math.max(diff1,Math.max(d2,Math.max(d3,Math.max(d4,d5)))));
    }
    static class FastScanner {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer("");
        String next() {
            while (!st.hasMoreTokens())
                try {
                    st=new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
        int[] readArray(int n) {
            int[] a=new int[n];
            for (int i=0; i<n; i++) a[i]=nextInt();
            return a;
        }
        String[] readStringArray(int n) {
            String[] a=new String[n];
            for (int i=0; i<n; i++) a[i]=next();
            return a;
        }
        long nextLong() {
            return Long.parseLong(next());
        }
    }
}

// This code is solely contributed by Subhojeet Sahoo aka Alpha_The_Coder