import java.util.*;
class Solution
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        
        int[] a=new int[5]; // Initialising array for 5 elements;

        for(int i=0;i<5;i++) // Input of the 5 elements .
        a[i]=sc.nextInt();

        // Input - 4 2 6 1 9 7

        Arrays.sort(a);  // Sorts the array in ascending order

        // After sort - 1 2 4 6 7 9 

        long minsum=0,maxsum=0;

        // Finding minsum

        for(int i=0;i<4;i++)
        minsum+=a[i];  

        // Finding maxsun

        for(int i=4;i>=1;i--)
        maxsum+=a[i];

        System.out.print(minsum+" "+maxsum);

    }
}
