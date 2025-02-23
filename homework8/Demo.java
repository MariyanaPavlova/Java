package lesson09.homework8;

public class Demo {
    public static void main(String[] args) {
        AdminUserImpl admin = new AdminUserImpl("admin");

        admin.printAllUsers(); //Database is empty. Nothing to print
        admin.deleteUser("user1"); //Database is empty. Nothing to delete


        admin.createUser("user1", false);
        admin.createUser("user2", false);
        admin.createUser("user2", false); //User: user2 already exists
        admin.createUser("adminUser2", true);
        admin.createUser("adminUser3", true);
        admin.createUser("adminUser4", true);
        admin.createUser("adminUser5", true);
        admin.createUser("adminUser6", true);
        admin.createUser("adminUser7", true);
        admin.createUser("adminUser8", true);
        admin.createUser("adminUser9", true); //full
        admin.createUser("adminUser10", true); //full
        admin.createUser("adminUser11", true); //full

        admin.deleteUser("adminUse10");  //User: adminUse10 not found

        admin.deleteUser("user1");
        admin.deleteUser("user2");
        admin.deleteUser("adminUser2");
        admin.deleteUser("adminUser3");
        admin.deleteUser("adminUser4");
        admin.deleteUser("adminUser5");
        admin.deleteUser("adminUser6");
        admin.deleteUser("adminUser7");


        admin.printAllUsers(); // only user in []

    }
}
