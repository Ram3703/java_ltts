package comparable;

public class Player implements Comparable<Player> {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Player(String name) {
		super();
		this.name = name;
	}

	@Override
	public int compareTo(Player o) {
		// TODO Auto-generated method stub
		return name.compareTo(o.getName());
	}

	@Override
	public String toString() {
		return "--" + name ;
	}

	
}
