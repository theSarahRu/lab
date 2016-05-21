package Baseball;

public class BaseballPlayer {
	
	private String name;
	private int jerseyNum;
	private String hit_type;
	private int hits;
	private int RBI;
	private int games;
	
	//constructor
	public BaseballPlayer(String name, int jerseyNum, String hit_type)
	{
		this.name = name;
		this.jerseyNum = jerseyNum;
		this.hit_type = hit_type;
		this.hits = 0;
		this.RBI = 0;
		this.games = 0;
	}
	//get name
	public String getName()
	{
		return this.name;
	}
	//get jersey number
	public int getJerseyNum()
	{
		return this.jerseyNum;
	}
	//get hitting type
	public String getHitType()
	{
		return this.hit_type;
	}
	//get hits
	public int getHits()
	{
		return this.hits;
	}
	//get RBI
	public int getRBI()
	{
		return this.RBI;
	}
	//get number of games
	public int getGames()
	{
		return this.games;
	}
	//add number of hits and RBIs after game
	public void addGameStats(int hits, int RBI)
	{
		this.hits += hits;
		this.RBI += RBI;
		this.games++;
	}
	//toString
	public String toString()
	{
		return "Player: " + this.name + " Jersey Number: " + this.jerseyNum + " Bats: " + this.hit_type + " Hits: " + this.hits + " RBI: " + this.RBI + " Total Games: " + this.games;
	}
	
	//test
	public static void main(String args[])
	{
		BaseballPlayer shortstop = new BaseballPlayer("Ozzie Smith", 1, "Both");
		System.out.println(shortstop.hit_type);
		shortstop.addGameStats(0,0);
		System.out.println(shortstop);
	}
}