package problem;

import java.util.Random;

public abstract class Problem
{


	public String question;
	public String problemType;
	public Random random = new Random();
	public int a = random.nextInt(10 - 0 + 1) ;
	public int b = random.nextInt(10 - 0 + 1) ;
	public int answer;



	public abstract int getAnswer();


	public abstract String getQuestion();


}
