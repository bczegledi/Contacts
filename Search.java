package contacts_list;

import java.util.Scanner;

public class Search extends Contact{
    public static void search() throws  Exception{
        Scanner in = new Scanner(System.in);
        Contacts = ReadFromFile.read();
        Menu.searchMenu();

        try{
            Integer input = Integer.parseInt(in.nextLine());
            if (input == 1) {
                System.out.print("Név: ");
                String searchedName = in.nextLine();
                String[] namePieces = searchedName.split(" ");
                String searchedLastName = namePieces[0];
                String searchedFirstName = namePieces[1];
                for (Contact i : Contacts) {
                    if (i.lastName.equals(searchedLastName) && i.firstName.equals(searchedFirstName)) {
                        System.out.println(i.toString());
                    }
                    else{
                        throw new InvalidNameException(searchedName);
                    }
                }
            }
            else if (input == 2) {
                System.out.print("Becenév: ");
                String searchedNickname = in.nextLine();
                for (Contact i : Contacts){
                    if (i.nickname.equals(searchedNickname)){
                        System.out.println(i.toString());
                    }
                    else {
                        throw new InvalidNicknameException(searchedNickname);
                    }
                }
            }
            else if (input == 3) {
                System.out.print("Cím: ");
                String searchedAddress = in.nextLine();
                for (Contact i : Contacts){
                    if (i.address.equals(searchedAddress)){
                        System.out.println(i.toString());
                    }
                    else {
                        throw new InvalidAddressException(searchedAddress);
                    }
                }
            }
            else if (input == 4) {
                System.out.print("Telefonszám: ");
                String searchedNumber = in.nextLine();
                for (Contact i : Contacts){
                    if (i.privatePhoneNumber.equals(searchedNumber) || i.workPhoneNumber.equals(searchedNumber)){
                        System.out.println(i.toString());
                    }
                    else {
                        throw new InvalidPhoneNumberException(searchedNumber);
                    }
                }
            }
            Menu.mainMenu();
        }
        catch (NumberFormatException n){
            System.out.println("Helytelen beviteli formátum! Elfogadott: [1-4]");
            Menu.searchMenu();
        }
    }
}
