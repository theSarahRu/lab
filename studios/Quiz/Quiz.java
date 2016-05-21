package Quiz;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {
	private ArrayList<Question> questions;
	private Scanner s;
	private String success;
	private String fail;
	private int grade;
	private int MAX_Q = 2;
	
	//constructor
	public Quiz()
	{
		questions = new ArrayList<Question>();
		s = new Scanner(System.in);
		this.success = "Correct!";
		this.fail = "Wrong!";
		grade = 0;
	}
	//start quiz: create questions array
	public int createQuiz()
	{
		int i = 0;
		System.out.println("What kind of quiz would you like to create? (1 = Multiple choice. 2 = Fill in Blank.) ");
		int type = s.nextInt();
		if(type == 1)
		{
			do
			{
				String[] a = createQuestion();
				MultChoice m = new MultChoice(a[0], a[1]);
				String[] options = new String[3];
				for(int k = 1; k < 4; k++)
				{
					System.out.println("Type option " + k + ": ");
					options[k-1] = s.next();
				}
				m.initMultiList(options[0], options[1], options[2]);
				questions.add(m);
				i++;
			}while(i < MAX_Q);
		}
		else
		{
			do
			{
				String[] a = createQuestion();
				Question q = new MultChoice(a[0], a[1]);
				questions.add(q);	
				i++;
			}while(i < MAX_Q);
		}
		return type;
	}
	//get question/a
	public String[] createQuestion()
	{
		String[] q = new String[2];
		System.out.println("What is the question? ");
		q[0] = s.next(); 
		System.out.println("What is the correct answer? (lower case) ");
		q[1] = s.next();
		return q;
	}
	public void startQuiz(int type)
	{
		int i = 0;
		String current;
		String response;
		do
		{	
			if(type == 1)
			{
				MultChoice q = (MultChoice) this.questions.get(i);
				System.out.println(q.getText());
				System.out.println("Choose an option.");
				q.displayMultiList();
				int a = s.nextInt();
				response = q.getOption(a);
				current = q.getAnswer();
			}
			else
			{
				Question q = this.questions.get(i);
				System.out.println(q.getText());
				response = s.next();
				current = q.getAnswer();
			}
			checkAnswer(current, response);
			i++;
		} while(i < MAX_Q);
	}
	//check response and reply & grade
	public void checkAnswer(String current, String response)
	{
		if(response.equals(current))
		{
			System.out.println(this.success);
			grade++;
		}
		else
		{
			System.out.println(this.fail);
			grade--;
			System.out.println("Correct Answer: " + current);
		}
	}
	//display grade
	public void displayGrade()
	{
		System.out.println("Final grade: " + this.grade);
	}
	//static main: start quiz and process response until exit or all questions asked
	public static void main(String[] args)
	{
		Quiz quiz = new Quiz();
		int type = quiz.createQuiz();
		quiz.startQuiz(type);
		quiz.displayGrade();
	}
}
