import java.util.*;
import java.lang.*;
class array{
static int findElementCount(int n,int [] arr,int x)
     {
        int c=0;
       for(int i=0;i<n;i++)
       {
           if(arr[i]==x)
           {
               c++;
           }
       }
       return c;
     }
    public static void main(String[] args)
    {
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         int [] arr=new int[n];
         if(n<1)
         {
             System.out.println("Invalide Input");
             System.exit(0);
         }
         if(n>20)
         {
             System.out.println("Range of array arris 20");
             System.exit(0);
         }
         int i;
         for(i=0;i<n;i++)
         {
             arr[i]=sc.nextInt();
             if(arr[i]<0)
             {
                 System.out.println("Invalid Input");
                 System.exit(0);
             }
         }
         int x=sc.nextInt();
         int k=0;
         if(x<0)
         {
             System.out.println("Invalid Input");
             System.exit(0);
         }
         else
         {
              k=findElementCount(n,arr,x);
         }
         System.out.println(k);
    }
}