package problem;



public class AdditionProblem extends Problem

{

	public AdditionProblem()

	{
		problemType = "Add";

		question = a + " + " + b + " = ";
		// sets value of answer for the generated problem
		answer = a + b;
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
