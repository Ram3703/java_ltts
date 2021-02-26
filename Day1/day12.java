import java.util.*;
class opp{

static int arithmetic(int x,int y,int z){
int s=0;
if(x<0 || y<0 || x>32767 || y>32767 || z<1 || z>4){
  return -1;
}
else{
switch(z){
  case 1:
    s=x+y;
    return s;
  case 2:
    s=x-y;
    return s;
  case 3:
    s=x*y;
    return s;
  case 4:
    s=x/y;
    return s;
  default:
    return 0;
}
}		
}


public static void main(String args[]){
Scanner sc= new Scanner(System.in);
System.out.println("Enter 1st number");
int a= sc.nextInt();
System.out.println("Enter 2nd number");
int b=sc.nextInt();
System.out.print("select operand\n");
System.out.println("1.add\n2.sub\n3.mul\n4.div");
int c=sc.nextInt();

int e = arithmetic(a,b,c);

if(e==-1)
  System.out.print("Invalid Option");
else
  System.out.print(e);
}
}