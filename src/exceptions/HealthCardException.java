package exceptions;

import data.HealthCardID;

public class HealthCardException extends Exception {
    public HealthCardException(String message){
        super(message);
    }
}
