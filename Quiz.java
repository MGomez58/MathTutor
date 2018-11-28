package primary;

import java.util.ArrayList;
import java.util.Random;

import problem.AdditionProblem;
import problem.DivisionProblem;
import problem.MultiplicationProblem;
import problem.Problem;
import problem.SubtractionProblem;

public class Quiz
{

	boolean addition;
	boolean subtraction;
	boolean multiplication;
	boolean division;
	ArrayList<Problem> problems = new ArrayList();

	public Quiz(boolean addition, boolean subtraction, boolean multiplication, boolean division)
	{
		this.addition = addition;
		this.subtraction = subtraction;
		this.multiplication = multiplication;
		this.division = division;

		while (problems.size() < 10)
		{
			Random random = new Random();
			int a = random.nextInt(4 - 1 + 1) + 1;
			addProblems(a);
		}
	}

	public ArrayList<Problem> getProblems()
	{
		return problems;
	}

	@Override
	public String toString()
	{
		return "Addition = " + addition + ", Subtraction = " + subtraction + ", multiplication = " + multiplication
				+ ", division = " + division;
	}

	public void addProblems(int num)
	{

		if (this.addition == true && num == 1)
			problems.add(new AdditionProblem());

		if (this.subtraction == true && num == 2)
			problems.add(new SubtractionProblem());

		if (this.multiplication == true && num == 3)
			problems.add(new MultiplicationProblem());

		if (this.division == true && num == 4)
			problems.add(new DivisionProblem());

	}

}
