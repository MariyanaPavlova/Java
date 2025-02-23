package lesson09.homework8;

public class Database {
    protected User[] users;


    protected Database(int capacity) {
        users = new User[capacity];
    }

    protected User[] getUsers() {
        return users;
    }


}

