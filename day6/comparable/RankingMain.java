package comparable;

import java.util.*;
import java.io.*;

public class RankingMain {
	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Ranking> list = new ArrayList<Ranking>();
		System.out.println("enetr no of players");
		int n = Integer.parseInt(br.readLine());
		for(int i=0;i<n;i++) {
			System.out.println("Enter name of player"+i);
			String name = br.readLine();
			System.out.println("enter score of player"+i);
			int age = Integer.parseInt(br.readLine());
			list.add(new Ranking(name,age));
		}
		Collections.sort(list);
		for(Ranking r:list) {
			System.out.println(r.getName()+" "+r.getScore());
		}
	}
}
