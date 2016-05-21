package Quiz;

public class Question {
	protected String text;
	protected String answer;	
	
	public Question(String text, String answer)
	{
		this.text = text;
		this.answer = answer;
	}
	public String getText()
	{
		return this.text;
	}
	public String getAnswer()
	{
		return this.answer;
	}
	public String toString()
	{
		return "Q: " + this.text + " A: " + this.answer;
	}
}
