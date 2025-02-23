package lesson09.homework8;

public interface AdminUser extends User{
    void deleteUser(String username);
    void createUser(String username, boolean isAdmin);
    void  printAllUsers();

}
