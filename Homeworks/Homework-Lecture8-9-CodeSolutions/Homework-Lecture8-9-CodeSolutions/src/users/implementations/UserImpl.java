package users.implementations;

import user.abstractions.AbstractUser;

public class UserImpl extends AbstractUser {

	public UserImpl(String userName) {
		super(userName);
	}

	//nothing else needed here as it comes inherited from AbstractUser, as it's the same behavior for both admins and normal users
}
