/*  Author : Alpha_The_Coder
    Created On 17/12/2020                           */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Marks {
    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        int n=sc.nextInt();
        String s;
        int m=sc.nextInt();
        int[][] marks=new int[n][m];
        for (int i = 0; i <n ; i++) {
            s=sc.next();
            for (int j = 0; j <m ; j++) {
                marks[i][j]=Integer.valueOf(s.charAt(j));
            }
        }
        boolean[] winners=new boolean[n];
        int[] max=new int[m];
        Arrays.fill(max,0);
        Arrays.fill(winners,false);
        for (int i = 0; i <m ; i++) {
            for (int j = 0; j <n ; j++) {
                max[i]=Math.max(max[i],marks[j][i]);
            }
        }
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <m ; j++) {
                if (marks[i][j]==max[j])
                {
                    winners[i]=true;
                }
            }
        }
        int ans=0;
        for (int i = 0; i <n ; i++) {
            if (winners[i]) ans++;
        }
        System.out.println(ans);
    }

    public static boolean isEven(int n)
    {
        if (n%2==0)
            return true;
        else return false;
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