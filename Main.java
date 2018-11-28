package primary;

import java.util.ArrayList;

import controllers.LogInController;
import controllers.MyAccountController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;

public class Main extends Application
{
	User currentUser;
	@Override
	public void start(Stage stage)
	{
		try
		{
			Parent root = FXMLLoader.load(getClass().getResource("/fxml/LogInScreen.fxml")); 
			Scene scene = new Scene(root); // attach scene graph to scene
			stage.setTitle("Math Tutor"); // displayed in window's title bar
			stage.setScene(scene); // attach scene to stage
			stage.show(); // display the stage

		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	public static void main(String[] args)
	{
		launch(args);
	}
	
	  @Override
	    public void stop() 
	  {
	       
	       
	       
	       
	       
	  }

	public User getCurrentUser()
	{
		return currentUser;
	}
	
	public void setCurrentUser(User currentUser)
	{
		this.currentUser = currentUser;
	}
	  
}