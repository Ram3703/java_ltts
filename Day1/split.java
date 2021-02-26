import java.util.*;
import java.lang.*;
class spit{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String a=sc.nextLine();
String b = sc.nextLine();
String a1[]=a.split(" ");
String b1[]=b.split(" ");
int l=a1.length;
int l1=b1.length;
if(a1[l-1].equals(b1[l1-1])){
  System.out.print("Yes");
}
else{
  System.out.print("No");
}
}
} 