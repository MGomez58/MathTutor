package controllers;

import java.util.ArrayList;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import primary.Main;
import primary.SerializableApp;
import primary.User;

public class CreateAccountController
{
	User currentUser;
	@FXML
	private TextField username;

	@FXML
	private Button signUp;

	@FXML
	private Button back;

	@FXML
	private Label usernameTaken;

	@FXML
	private TextField password;;

	@FXML
	void backAction(ActionEvent event)
	{
		closeThisScene();
		launchLogInScreen();
	}

	private void closeThisScene()
	{
		username.getScene().getWindow().hide();
	}

	private void launchLogInScreen()
	{
		try
		{
			Parent logInScreen = FXMLLoader.load(getClass().getResource("/fxml/LogInScreen.fxml"));

			Scene scene = new Scene(logInScreen);
			Stage stage = new Stage();
			stage.setTitle("Sign in / Sign up");
			stage.setScene(scene);
			stage.show();
			
		} catch (Exception e)
		{
			System.out.println("Can't open About window.");
		}
	}

	@FXML
	void signUpAction(ActionEvent event)
	{
		boolean valid = true;
		
		User newUser = new User(username.getText(), password.getText());
		ArrayList<User> myList = new ArrayList<User>();

		myList = SerializableApp.deserialize("users.ser");

		for (User u : myList)
		{
			if (newUser.getUserName().equals(u.getUserName()))
			{
				usernameTaken.setVisible(true);
				valid = false;
			}
		}
		
		if (valid == true)
		{
			myList.add(newUser);
			SerializableApp.serialize(myList, "users.ser");

			closeThisScene();
			launchLogInScreen();
		
		}
	}

}
