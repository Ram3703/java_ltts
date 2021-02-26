import java.util.Scanner;
class fact
{
	public static void main(String [] args)
	{
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		digitfactorial(n);
}
static void digitfactorial(int n)

{
int s=0;       
    if(n>32767)
		{
		System.out.println("Number too large");
		}
		else if(n<1)
		{
		System.out.println("Number too small");
		}
		else
		{
		int t=n;
		while (t!= 0)
		 {
      
     		 t=t/10;
     		 s++;
   		 }
		
		int r=0; 
		int []a=new int[s];
		for(int i=s-1;i>=0;i--)
		{
		r=n%10;
		a[i]=r;
		n=n/10;
		}
		int temp=0,sum;
		for(int j=0;j<s;j++)
		{
		temp=a[j];
		sum=1;
		while(temp!=0)
		{
		sum=sum*temp;
		temp=temp-1;
		}
		a[j]=sum;
		}
for(int k=0;k<s;k++)
{
System.out.println(a[k]);
}
}
}
}