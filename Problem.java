package problem;

import java.util.Random;

public abstract class Problem
{

	
	public String question;
	Random random = new Random();
	int a = random.nextInt(10 - 0 + 1) + 0;
	int b = random.nextInt(10 - 0 + 1) + 0;
	int answer;
	


	abstract int getAnswer();
	
	
	public abstract String getQuestion();
	
	
}
