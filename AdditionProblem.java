package problem;

import java.util.Random;

public class AdditionProblem extends Problem

{
	String problemType = "addition";
	
	public AdditionProblem() 
	
	{
		question = a + " + " + b + " = ";
	}
	
	public String getQuestion()
	{
		return question;
	}

	@Override
	int getAnswer()
	{
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
