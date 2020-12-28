/*  Author : Alpha_The_Coder
    Created On 25/12/2020                           */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class color {
    public static void main(String[] args) {
        FastScanner sc=new FastScanner();
        int n=sc.nextInt();
        String s=sc.next();
        int m=0;
        char current=s.charAt(0);
        for (int i = 1; i <n ; i++) {
            if (s.charAt(i)==current)
                ++m;
            else
                current=s.charAt(i);
        }
        System.out.println(m);
    }
    //  RBGGRGBRRGBR           GR
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
            String[] s=new String[n];
            for (int i=0; i<n; i++) s[i]=next();
            return s;
        }
        long nextLong() {
            return Long.parseLong(next());
        }
    }
}
// This code is solely contributed by Subhojeet Sahoo aka Alpha_The_Coder