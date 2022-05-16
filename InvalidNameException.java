package contacts_list;


public class InvalidNameException extends Exception{
    public InvalidNameException(String input){
        super(input);
    }

    @Override
    public String getMessage() {
        return "A keresett név nem létezik!";
    }
}
