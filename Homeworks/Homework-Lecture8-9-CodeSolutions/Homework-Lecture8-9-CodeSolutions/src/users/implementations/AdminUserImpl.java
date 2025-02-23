package users.implementations;

import database.DataBase;
import user.abstractions.AbstractUser;
import user.abstractions.AdminUser;
import user.abstractions.User;

public class AdminUserImpl extends AbstractUser implements AdminUser {

	private final static int MAX_USERS_DATABASE_SIZE = 10;

	private DataBase database;

	public AdminUserImpl(String userName) {
		super(userName, true); //hardcoded true for isAdmin as all objects of this class are admins
		this.database = new DataBase(MAX_USERS_DATABASE_SIZE);
	}

	@Override
	public void deleteUser(String userName) {
		if(isLoggedIn()) {
			database.deleteUser(userName);
		} else {
			System.out.println("The Admin: '" + this.getUserName() +"' need to login first, in order to delete anyone.");
		}
	}

	@Override
	public User createUser(String userName, boolean isAdmin) {
		if (isLoggedIn()) {
			if (isAdmin) {
				User adminUser = new AdminUserImpl(userName); //making admin instance to be added in the database

				boolean isUserAdded = database.addUser(adminUser);
				if(isUserAdded) {
					System.out.println("The Admin: '" + userName + "' has been successfully ADDED to the database.");
					return adminUser;
				}

				return null; //return null if the admin was not added
			} else {
				User normalUser = new UserImpl(userName); //making normal user instance to be added in the database

				boolean isNormalUserAdded = database.addUser(normalUser);
				if(isNormalUserAdded) {
					System.out.println("The Normal User: '" + userName + "' has been successfully ADDED to the database.");
					return normalUser;
				}

				return null; //return null if the normal user was not added
			}
		} else {
			System.out.println("The Admin: '" + this.getUserName() +"' need to login first, in order to create new users.");
			return null; //return null as no user was created, as the admin has to first login in order to create users
		}
	}

	@Override
	public void viewAllUsers() {
		if (isLoggedIn()) {
			System.out.println("The Admin: '" + this.getUserName() +"' is viewing all of the users:");
			User[] allUsers = database.getDataBase();

			for (int i = 0; i < allUsers.length; i++) {
				if(allUsers[i] != null) {
					System.out.println(allUsers[i].toString());
				}
			}
		} else {
			System.out.println("The Admin: '" + this.getUserName() +"' needs to login first, in order to view all users.");
		}
	}
}
