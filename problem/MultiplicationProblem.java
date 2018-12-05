package problem;



public class MultiplicationProblem extends Problem

{

	public MultiplicationProblem()

	{
		problemType = "Mult";

		question = a + " x " + b + " = ";
		// sets value of answer for the generated problem
		answer = a * b;
	}

	public String getQuestion() {
		// returns the question to be used for this problem
		return question;
	}

	@Override
	public int getAnswer() {
		// returns the answer for this problem
		return answer;
	}

}