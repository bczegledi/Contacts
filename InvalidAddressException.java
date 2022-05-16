package contacts_list;

import java.util.ArrayList;

public class InvalidAddressException extends Exception {
    public InvalidAddressException(String input){
        super(input);
    }

    @Override
    public String getMessage() {
        return "A keresett cím nem található!";
    }
}
