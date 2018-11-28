package primary;

import java.util.ArrayList;

public class test
{

	public static void main(String[] args)
	{
	User admin = new User("Admin", "Admin");
	ArrayList<User> list = new ArrayList<User>();
	//list = SerializableApp.deserialize("users.ser");
//	
//	for(User u : list)
//	System.out.println(u.getFirstName());
	
	list.add(admin);
	SerializableApp.serialize(list, "users.ser");

	}
}
