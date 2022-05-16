package contacts_list;

public class FullName {
    public String lastName;
    public String firstName;

    public FullName(String lN, String fN){
        lastName = lN;
        firstName = fN;
    }

    public FullName(){
        lastName = null;
        firstName = null;
    }

    public String toString(){
        String ret = lastName + " " + firstName;
        return ret;
    }

    public String getLastName() { return lastName; }
    public String getFirstName() { return firstName; }


}
