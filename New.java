package contacts_list;

import java.util.Scanner;

public class New extends Contact{

    public static void newContact(){
        Scanner in = new Scanner(System.in);
        Contacts = ReadFromFile.read();
        while (true){
            Contact c = new Contact();
            System.out.print("Név: ");
            String nameIn = in.nextLine();
            String[] namePcs = nameIn.split(" ");
            if(nameIn.length() == 0) break;
            c.lastName = namePcs[0];
            c.firstName = namePcs[1];
            System.out.print("Becenév: ");
            String nicknameIn = in.nextLine();
            c.nickname = noData.nothing(nicknameIn);
            System.out.print("Cím: ");
            String addressIn = in.nextLine();
            c.address = noData.nothing(addressIn);
            System.out.print("Munkahelyi szám: ");
            String workPhoneNumberIn = in.nextLine();
            c.workPhoneNumber = noData.nothing(workPhoneNumberIn);
            System.out.print("Privát szám: ");
            String privateNumberIn = in.nextLine();
            c.privatePhoneNumber = noData.nothing(privateNumberIn);
            Contacts.add(c);
        }
        WriteToFile.write(Contacts);
        Menu.mainMenu();
    }
}
