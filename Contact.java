package contacts_list;


import java.util.ArrayList;

public class Contact extends FullName{
    public String nickname;
    public String address;
    public String workPhoneNumber;
    public String privatePhoneNumber;
    protected static ArrayList<Contact> Contacts = new ArrayList<>();

    public Contact(String ln, String fn, String nickname, String address, String workPhoneNumber, String privateNumber){
        super(ln, fn);
        this.nickname = nickname;
        this.address = address;
        this.workPhoneNumber = workPhoneNumber;
        this.privatePhoneNumber = privateNumber;
    }

    public Contact(){
        super();
        this.nickname = null;
        this.address = null;
        this.workPhoneNumber = null;
        this.privatePhoneNumber = null;
    }

    public String toString(){
        String ret = super.toString() + "\t" + nickname + "\t" + address + "\t" + workPhoneNumber + "\t" + privatePhoneNumber;
        return ret;
    }

    public String getNickname() { return nickname; }
    public String getAddress() { return address; }
    public String getWorkPhoneNumber() { return workPhoneNumber; }
    public String getPrivatePhoneNumber() { return privatePhoneNumber; }

}