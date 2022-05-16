package contacts_list;

import java.util.Comparator;

public class NameComparator implements Comparator<Contact> {
    public int compare(Contact c1, Contact c2){
        String nameToCompare1;
        String nameToCompare2;
        if(c1.getLastName().equals(c2.getLastName())){
            nameToCompare1 = c1.getFirstName();
            nameToCompare2 = c2.getFirstName();
        }
        else{
            nameToCompare1 = c1.getLastName();
            nameToCompare2 = c2.getLastName();
        }
        return nameToCompare1.compareTo(nameToCompare2);
    }
}
