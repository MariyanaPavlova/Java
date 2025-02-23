package lesson09.homework8;
import java.util.Date;

public abstract class AbstractUser implements User{
        protected  String username;
        protected Date registrationDate;
        protected boolean isLoggedIn;

        public AbstractUser(String username){
                this.username = username;
                this.registrationDate = new Date();
                this.isLoggedIn = false;
        }

        @Override
        public void login() {
                isLoggedIn = true;
        }

        @Override
        public void logout() {
                isLoggedIn = false;
        }

        @Override
        public String getUsername() {
                return username;
        }

        @Override
        public Date getRegistrationDate() {
                return registrationDate;
        }
}
