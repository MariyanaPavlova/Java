package lesson09.homework8;


public class AdminUserImpl extends AbstractUser implements AdminUser {

    private  static final int DATABASE_CAPACITY = 10;
    private Database database;


    public AdminUserImpl(String username) {
        super(username);
        database = new Database(DATABASE_CAPACITY);
    }



    @Override
    public void createUser(String username, boolean isAdmin) {

        User[] users = database.getUsers();

        for (int i = 1; i < users.length; i++) {
            if (users[i] == null) {
                if (isAdmin) {
                    users[i] = new AdminUserImpl(username);// създава админ потребител
                    System.out.println("User: " + username + " has been added");
                    return;
                } else {
                    users[i] = new UserImpl(username); // създава нормален потребите.
                    System.out.println("User: " + username + " has been added");
                    return;
                }
            }
            else if (users[i] != null && users[i].getUsername().equals(username)) {
                System.out.println("User: "+ username + " already exists");
                return;
            }
        }
        System.out.println("Database is full, no more free space");
    }


    @Override
    public void deleteUser(String username) {

        User[] users = database.getUsers();
        boolean isEmpty = true;
        for (int i = 1; i < users.length; i++) {
            if (users[i] != null && users[i].getUsername().equals(username)) {
                users[i] = null;
                System.out.println("User: "+ username + " deleted");
                isEmpty = false;
                return;
            }
            else if (users[i] != null && !users[i].getUsername().equals(username)) {
                System.out.println("User: "+ username + " not found and not deleted");
                isEmpty = false;
                return;
            }
        }
        if (isEmpty) {
            System.out.println("Database is empty. Nothing to delete");
        }
    }


    @Override
    public void printAllUsers() {

        User[] users = database.getUsers();
        boolean isEmpty = true;
        for (int i = 1; i < users.length; i++) {
            if (users[i] != null) {
                System.out.println("Username: " + users[i].getUsername() +
                        ", Registered on: " + users[i].getRegistrationDate());
                isEmpty = false;
            }
        }
        if (isEmpty) {
            System.out.println("Database is empty. Nothing to print");
        }

    }
}
