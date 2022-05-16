package contacts_list;

import java.util.Comparator;

public class NicknameComparator implements Comparator<Contact> {
    public int compare(Contact c1, Contact c2) {
        String nicknameToCompare1 = c1.getNickname();
        String nicknameToCompare2 = c2.getNickname();
        return nicknameToCompare1.compareTo(nicknameToCompare2);
    }
}
