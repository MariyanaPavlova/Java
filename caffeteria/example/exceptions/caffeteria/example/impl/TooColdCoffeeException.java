package caffeteria.example.exceptions.caffeteria.example.impl;

public class TooColdCoffeeException extends Exception {
    public TooColdCoffeeException() {
    }

    public TooColdCoffeeException(String message) {
        super(message);
    }

    public TooColdCoffeeException(String message, Throwable cause) {
        super(message, cause);
    }

    public TooColdCoffeeException(Throwable cause) {
        super(cause);
    }

    public TooColdCoffeeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
