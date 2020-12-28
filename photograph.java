/*  Author : Alpha_The_Coder
    Created On 17/12/2020                           */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class photograph {
    //
    public static void main(String[] args) {
        FastScanner sc=new FastScanner();
        int n=sc.nextInt();
        int initial=sc.nextInt();
        int[][] distance=new int[n][2];
        int[] unit=new int[1001];
        Arrays.fill(unit,0);
        for (int i=0;i<n;i++)
        {
            for (int j = 0; j <2 ; j++) {
                distance[i][j]=sc.nextInt();
            }

            if (distance[i][0]<distance[i][1]) {
                for (int k = distance[i][0]; k <= distance[i][1]; k++) {
                    unit[k]++;
                }
            }
            else
            {
                for (int k = distance[i][0]; k >= distance[i][1]; k--) {
                    unit[k]++;
                }

        }

            }
        int ans=Integer.MAX_VALUE;
            boolean found=false;
        for (int i = 1; i <=1000 ; i++) {
            if (unit[i]==n)
            {
                found=true;
                ans=Math.min(Math.abs(initial-i),ans);
            }
        }
        if (found) System.out.println(ans);
        else System.out.println(-1);
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
        long nextLong() {
            return Long.parseLong(next());
        }
    }
}

// This code is solely contributed by Subhojeet Sahoo aka Alpha_The_Coder