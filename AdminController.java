package controllers;

import java.util.ArrayList;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import primary.SerializableApp;
import primary.User;

public class AdminController
{
	ArrayList<User> list = new ArrayList<User>();
	ObservableList<User> options = FXCollections.observableArrayList();

	@FXML
	private ComboBox<User> comboBox;

	@FXML
	private Button addUser;

	@FXML
	private Button deleteUser;

	@FXML
	private TextField username;

	@FXML
	private TextField password;

	@FXML
	void addUserAction(ActionEvent event)
	{
		list = SerializableApp.deserialize("users.ser");
		User newUser = new User(username.getText(), password.getText());
		list.add(newUser);
		options.add(newUser);
		comboBox.setItems(options);
		SerializableApp.serialize(list, "users.ser");

	}

	@FXML
	void comboBoxAction(ActionEvent event)
	{

	}

	@FXML
	void deleteUserAction(ActionEvent event)
	{
		
		
		User delete = comboBox.getValue();
		System.out.println(delete);
		options.remove(delete);
		list.remove(delete);
		SerializableApp.serialize(list, "users.ser");
		comboBox.setValue(null);

	}

	@FXML
	void passwordAction(ActionEvent event)
	{

	}

	@FXML
	void usernameAction(ActionEvent event)
	{

	}

	@FXML
	void initialize()
	{

		list = SerializableApp.deserialize("users.ser");
		for (User user : list)
		{
			options.add(user);
		}
		comboBox.setItems(options);

	}

}