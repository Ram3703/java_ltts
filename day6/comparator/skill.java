package comparator;

import java.util.Comparator;

public class skill implements Comparator<Player>{

	@Override
	public int compare(Player o1, Player o2) {
		// TODO Auto-generated method stub
		return o1.skill.compareTo(o2.name);
	}

}
