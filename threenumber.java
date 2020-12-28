import java.util.*;
public class threenumber
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-- > 0)
        {
            long n=sc.nextLong();
            long a=0L,b=0L,c=0L;
            boolean found=false;
            for (long i=2L;i<=Math.sqrt((long)n);i++)
            {
                if (n % i == 0)
                {
                    n=n/i;
                    a=i;
                    found=true;
                    break;
                }
            }
            if (found)
            {
                found=false;
            for (long i=2;i<=Math.sqrt((long)n);i++)
                    {
                        if (n%i==0 && i!=a)
                        {
                                    b=i;
                                     c=n/i;
                                     if (c!=a && c!=b)
                                     {
                                        found=true;
                                        break;
                                     }
                         }
                    }
            if (found)
            {
                System.out.println("YES");
                System.out.println(a + " " + b + " " + c);
            }
            else
                System.out.println("NO");

            }
            else
                System.out.println("NO");

        }
    }
}