package lesson09.homework8;

import java.util.Date;

public interface User {
    void login();
    void logout();
    String getUsername();
    Date getRegistrationDate();
}
