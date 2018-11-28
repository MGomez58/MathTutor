package primary;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class SerializableApp
{

	public static void serialize(ArrayList<User> list, String fileName)
	{
		// ObjectOutputStream converts an object to weird funky shit that expects to be
		// written to a file
		// Fileoutputstream is a bridge between code and a file

		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName)))
		{
			out.writeObject(list);
			System.out.println("Successfully serialized.\n");
		}

		catch (IOException ex)
		{
			System.out.println("Nah bruh " + ex.getMessage());
		}
	}
	
	public static void serialize(User user, String fileName)
	{
		// ObjectOutputStream converts an object to weird funky shit that expects to be
		// written to a file
		// Fileoutputstream is a bridge between code and a file

		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName)))
		{
			out.writeObject(user);
			System.out.println("Successfully serialized.\n");
		}

		catch (IOException ex)
		{
			System.out.println("Nah bruh " + ex.getMessage());
		}
	}

	public static ArrayList<User> deserialize(String fileName)
	{
		ArrayList<User> list = null;
		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName)))
		{
			list = (ArrayList<User>) in.readObject();
			System.out.println("Successfully deserialized.\n");
		}

		catch (IOException | ClassNotFoundException ex)
		{

			System.out.println("error deserializing. " + ex.getMessage());
		}
		return list;
	}
	
	public static User deserializeUser(String fileName)
	{
		User user = null;
		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName)))
		{
			user = (User) in.readObject();
			System.out.println("Successfully deserialized.\n");
		}

		catch (IOException | ClassNotFoundException ex)
		{

			System.out.println("error deserializing. " + ex.getMessage());
		}
		return user;
	}
}
