package comparator;

import java.util.Comparator;

public class PlayerComparator implements Comparator<Player>{

	

	@Override
	public int compare(Player o1, Player o2) {
		// TODO Auto-generated method stub
		return o1.name.compareTo(o2.name);
	}

}