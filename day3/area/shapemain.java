package abst;
import java.util.*;
public class shapemain {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Circle");
		System.out.println("Square");
		String s = sc.next();
		String st = s.toLowerCase();
		if(st.equals("circle")) {
			shape c =new circle();
			System.out.println("Enter the radius");
			int radius = sc.nextInt();
			c.setValue(radius);
			double r= c.calculateArea(radius);
			System.out.println(r);
			}
		else {
			shape q =new square();
			System.out.println("Enter the side");
			int side = sc.nextInt();
			q.setValue(side);
			double r= q.calculateArea(side);
			System.out.println(r);
		}
	}
}
