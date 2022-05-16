package contacts_list;

import java.util.Collections;
import java.util.Scanner;

public class List extends Contact{
    public static void list(){
        Scanner in = new Scanner(System.in);
        Contacts = ReadFromFile.read();
        Menu.listMenu();

        try{
            Integer input = Integer.parseInt(in.nextLine());
            if (input == 1) {
                Collections.sort(Contacts, new NameComparator());
            }
            else if (input == 2) {
                Collections.sort(Contacts, new NicknameComparator());
            }
            else if (input == 3) {}
            for (Contact c : Contacts){
                System.out.println(c.toString());
            }
            Menu.mainMenu();
        }
        catch (NumberFormatException n){
            System.out.println("Helytelen beviteli formátum! Elfogadott: [1-3]");
            Menu.listMenu();
        }
    }
}
