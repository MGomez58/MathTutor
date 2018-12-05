package problem;



public class SubtractionProblem extends Problem

{

	public SubtractionProblem()

	{
		problemType = "Sub";
		// statement to ensure the value of the subtraction problem
		// always results in a positive value, the functionality can
		// be updated in the future to allow for negative values to
		// be included
		if (a < b) {
			question = b + " - " + a + " = ";
			answer = b - a;
		} else {
			question = a + " - " + b + " = ";
			answer = a - b;
		}

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