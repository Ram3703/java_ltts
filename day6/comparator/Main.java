package comparator;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String args[]) {
		ArrayList<Player> p = new ArrayList<Player>();
		p.add(new Player("ram","java"));
		p.add(new Player("hujk","kdb"));
		p.add(new Player("rfth","kji"));
		System.out.println("unsorted");
		for(int i=0;i<p.size();i++)
			System.out.println(p.get(i));
		
		Collections.sort(p, new PlayerComparator());
		
		System.out.println("Sorted array");
		
		for(int i=0;i<p.size();i++) {
			System.out.println(p.get(i));
		}
		Collections.sort(p,new skill());
		
		System.out.println("skill sort");
		
		for(int i=0;i<p.size();i++) {
			System.out.println(p.get(i));
		}
		
	}
}
