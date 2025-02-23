package database;

import user.abstractions.User;

public class DataBase {
	private User[] dataBase;

	public DataBase(int userLimitCount) {
		this.dataBase = new User[userLimitCount];
	}
	
	public User[] getDataBase() {
		return dataBase;
	}
	
	public boolean addUser(User user) {
		if(checkIfUserExists(user.getUserName())) {
			return false;
		}

		//finding the first empty slot in the database to create a new user into it
		for (int i = 0; i < dataBase.length; i++) {
			if (dataBase[i] == null) {
				dataBase[i] = user;
				return true;
			}
		}

		System.out.println("The database is already full, the user: '" + user.getUserName() + "' will not be added.");
		return false;
	}

	public void deleteUser(String userName) {
		for (int i = 0; i < dataBase.length; i++) {
			if(dataBase[i] != null) {
				if(dataBase[i].getUserName().equalsIgnoreCase(userName)) {
					System.out.println("User '" + dataBase[i].getUserName() +"' has been successfully DELETED.");
					dataBase[i] = null;
					return;
				}
			}
		}

		System.out.println("The database is empty, there is nothing to delete.");
	}



	//private method for reusability to check if a user with specific name already exists
	private boolean checkIfUserExists(String userName) {
		for (int i = 0; i < dataBase.length; i++) {
			if (dataBase[i] != null) {
				if(dataBase[i].getUserName().equalsIgnoreCase(userName)) {
					return true;
				}
			}
		}

		// there was no such user, we can continue with adding it
		return false;
	}
}
