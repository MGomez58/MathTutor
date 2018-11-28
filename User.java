package primary;

import java.io.Serializable;

public class User implements Serializable
{

	String userName;
	String password;
	String firstName;
	String lastName;
	String emailAddress;
	String phoneNumber;
	
	
	Quiz continueQuiz;
	Lesson continueLesson;
	boolean lessonsCompleted;
	
	public User()

	{
		
	}
	public String getFirstName()
	{
		return firstName;
	}
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	public String getLastName()
	{
		return lastName;
	}
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}
	public String getEmailAddress()
	{
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress)
	{
		this.emailAddress = emailAddress;
	}
	public String getPhoneNumber()
	{
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber)
	{
		this.phoneNumber = phoneNumber;
	}

	public Quiz getContinueQuiz()
	{
		return continueQuiz;
	}
	public void setContinueQuiz(Quiz continueQuiz)
	{
		this.continueQuiz = continueQuiz;
	}
	public Lesson getContinueLesson()
	{
		return continueLesson;
	}
	public void setContinueLesson(Lesson continueLesson)
	{
		this.continueLesson = continueLesson;
	}
	public void setUserName(String userName)
	{
		this.userName = userName;
	}
	public void setPassword(String password)
	{
		this.password = password;
	}
	public User(String userName, String password)

	{
		this.userName = userName;
		this.password = password;
	}

	public String getUserName()
	{
		return userName;
	}

	public String getPassword()
	{
		return password;
	}

	@Override
	public String toString()
	{
		return "userName = " + userName + ", password = " + password;
	}

}
