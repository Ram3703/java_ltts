import java.util.*;
class EmployeeMain{
public static void main(String args[]){

Employee e = new Employee();
Scanner sc = new Scanner(System.in);

String s1=sc.nextLine();
//String s2 =sc.nextLine();
//String s3 = sc.nextLine();

String Details[] = s1.split(",");

e.setname(Details[0]);
e.setaddr(Details[1]);
e.setmob(Details[2]);

//System.out.println(e.getname());
//System.out.println(e.getaddr());
//System.out.println(e.getmob());

String n=e.getname();
String a=e.getaddr();
String m=e.getmob();

e.detailsInfo(n,a,m);
}
}