package contacts_list;

public class InvalidPhoneNumberException extends Exception{
    public InvalidPhoneNumberException(String input){
        super(input);
    }

    @Override
    public String getMessage() {
        return "A megadott telefonszám nem található!";
    }
}
