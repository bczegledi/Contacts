package contacts_list;

import java.util.ArrayList;

public class InvalidNicknameException extends Exception{
    public InvalidNicknameException(String input){
        super(input);
    }

    @Override
    public String getMessage() {
        return "A keresett becenév nem található!";
    }
}
