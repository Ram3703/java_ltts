import java.util.*;
class Employee{
private String name;
private String addr;
private String mob;

public void setname(String name){
	this.name = name;
}
public void setaddr(String addr){
	this.addr = addr;
}
public void setmob(String mob){
	this.mob = mob;
}
public String getname(){
	return name;
}
public String getaddr(){
	return addr;
}
public String getmob(){
	return mob;
}

public void detailsInfo(String n,String a, String m){
	System.out.print(n+"\n"+a+"\n"+m);
}

}