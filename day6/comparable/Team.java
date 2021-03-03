package comparable;

import java.util.*;

public class Team implements Comparable<Team>{
	private String name;
	private List<Player> playerList=new ArrayList<Player>();
	
	
	
	public Team(String name) {
		super();
		this.name = name;
	}
	
	public Team() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Team(String name, List<Player> playerList) {
		super();
		this.name = name;
		this.playerList = playerList;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List getPlayerList() {
		Collections.sort(playerList);
		return playerList;
	}
	public void setPlayerList(List playerList) {
		this.playerList = playerList;
	}
	
	public void addplayer(String name) {
		playerList.add(new Player(name) );
	}
	@Override
	public int compareTo(Team o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}	
