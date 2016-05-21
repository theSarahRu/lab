package Quiz;

public class MultChoice extends Question {
	private String options[];
	
	public MultChoice(String text, String answer)
	{
		super(text, answer);
		this.options = new String[4];		
	}
	public String getOption(int a)
	{
		return this.options[a];
	}
	//put answer and choices into an options array for display
	public void initMultiList(String choice1, String choice2, String choice3)
	{
		this.options[0] = this.answer;
		this.options[1] = choice1;
		this.options[2] = choice2;
		this.options[3] = choice3;
	}
	public void displayMultiList()
	{
		for(int i = 1; i <= 4; i++)
		{
			System.out.println("Option " + i + ": "+ this.options[i]);
		}
	}
	
	public String toString()
	{
		return super.toString() + " Options: " + this.options[1] + ", " + this.options[2] + ", " + this.options[3]; 
	}

}
