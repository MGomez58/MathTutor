package primary;

import java.util.ArrayList;

import problem.AdditionProblem;
import problem.DivisionProblem;
import problem.MultiplicationProblem;
import problem.Problem;
import problem.SubtractionProblem;

public class Lesson {

	public ArrayList<Problem> problems = new ArrayList<Problem>();
	public String lessonType;

	// Lesson Constructor taking a String as an argument to specify the
	// type of problems within the lesson
	public Lesson(String operation) {
		lessonType = operation;

		// Switch statement to change the type of problems that are to
		// be contained within the ArrayList of Problems
		switch (operation) {
		case "Sub":
			for (int i = 0; i < 10; i++)
				this.problems.add(new SubtractionProblem());
			break;
		case "Add":
			for (int i = 0; i < 10; i++)
				this.problems.add(new AdditionProblem());
			break;
		case "Mult":
			for (int i = 0; i < 10; i++)
				this.problems.add(new MultiplicationProblem());
			break;
		case "Div":
			for (int i = 0; i < 10; i++)
				this.problems.add(new DivisionProblem());
			break;
		}
	}

}
