package comparable;

public class Ranking implements Comparable<Ranking> {
	
	private String name;
	private int score;
	private int players;
	
	
	public int getPlayers() {
		return players;
	}


	public void setPlayers(int players) {
		this.players = players;
	}


	public Ranking(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}
	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getScore() {
		return score;
	}


	public void setScore(int score) {
		this.score = score;
	}

	

	

	@Override
	public String toString() {
		return "Ranking [name=" + name + ", score=" + score + ", players=" + players + ", getPlayers()=" + getPlayers()
				+ ", getName()=" + getName() + ", getScore()=" + getScore() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}


	@Override
	public int compareTo(Ranking r) {
		// TODO Auto-generated method stub
		if(score == r.score)
			return 0;
		else if(score<r.score)
			return 1;
		else
			return -1;
	}

}
