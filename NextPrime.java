/*  Author : Alpha_The_Coder
    Created On 25/12/2020                           */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        FastScanner sc=new FastScanner();
        int n=sc.nextInt();
        int m=sc.nextInt();

        boolean ok=isPrime(m);
        if (!ok)
        {
            System.out.println("NO");
            System.exit(0);
        }
        for (int i = n+1; i <=m ; i++) {
            if (isPrime(i) && i!=m)
            {
                ok=false;
                break;
            }
        }
        if (ok) System.out.println("YES");
        else System.out.println("NO");
    }
    public static boolean isPrime(int n)
    {
        for (int i = 2; i <=(int)Math.sqrt(n) ; i++) {
            if (n%i==0)
                return false;
        }
        return true;
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