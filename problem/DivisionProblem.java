package problem;



public class DivisionProblem extends Problem

{

	public int num;
	
	
	public DivisionProblem()

	{
		problemType = "Div";
		// case if value for denominator turns out to be 0
		// sets a new value to b to ensure the value is not 0
		// to prevent a "divide by 0" arithmetic exception
		if (b == 0) {
			b = (((int) (Math.random() * 10)));
		}

		// sets a value to be used as the numerator to ensure the
		// answer will always result in whole number division, this
		// prevents the possibility of a remainder and saves the trouble
		// of having mixed fractions in the program
		//
		 num = (((int) (Math.random() * 10))) * b; //
		question = num + " ÷ " + b + " = "; //
		answer = num / b; //
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