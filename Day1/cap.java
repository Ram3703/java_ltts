import java.lang.*;
import java.util.*;
class str{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
String a=sc.nextLine();
String b=sc.nextLine();
b=b.toUpperCase();
String f1=a.substring(0,1);
String r=a.substring(1,a.length());
r=r.toLowerCase();
f1=f1.toUpperCase();
a=f1+r;
a=a.concat(" "+b);
System.out.print(a);
}
}