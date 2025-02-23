package demo;

import user.abstractions.AdminUser;
import user.abstractions.User;
import users.implementations.AdminUserImpl;

public class UsersDemo {

	public static void main(String[] args) {
		AdminUser milen = new AdminUserImpl("milen");
		milen.login();
		
		System.out.println("--------------------CREATIONS--------------------------");

		milen.createUser("gosho", true);
		User ivan = milen.createUser("ivan", false);
		if(ivan != null) {
			System.out.println("Ivan's registration date is: " + ivan.getRegistrationDate());
			System.out.println("Ivan's username is: " + ivan.getUserName());
		}
		milen.createUser("maria", false);
		milen.createUser("stefcho", false);
		milen.createUser("stefcho1", false);
		milen.createUser("stefka", false);
		milen.createUser("stefcho2", false);
		milen.createUser("stefcho3", false);
		milen.createUser("gergana", true);
		milen.createUser("stefcho4", false);
		milen.createUser("stefcho5", false);
		milen.createUser("stefcho6", false);
		milen.createUser("stefcho7", false);
		milen.createUser("stefcho8", false);
		milen.createUser("stefcho9", false);

		milen.viewAllUsers();
		
		System.out.println("----------------------DELETION------------------------");
		
		milen.deleteUser("stefcho3");
		
		milen.viewAllUsers();
	}
}
