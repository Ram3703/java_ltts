import java.util.*;
class great{
static void findid(int[] arr,int n, int s)
{
	for(int j=0;j<n;j++)
  	{
    		if(s<arr[j])
    		{
      			System.out.println(arr[j-1]);
    		}
  	}
}
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    if(n<4){
      System.out.print("Invalid array size");
    }
    else{
      int[] arr = new int[n];
        for(int i=0;i<n;i++){
          arr[i]=sc.nextInt();
            if(arr[i]<0){
	      System.out.print("Invalid input");
	      System.exit(0);
            }
        }
        int x= sc.nextInt();
        if(x<1){
          System.out.print("Invalid score");
        }
        else{
          findid(arr,n,x);
            
          
        }
      }
    }
}
