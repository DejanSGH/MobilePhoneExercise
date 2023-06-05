import java.util.ArrayList;

public class MobilePhone {

    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String name) {
        this.myNumber = name;
        this.myContacts = new ArrayList<Contact>();

    }

    public boolean addNewContact(Contact contact){
        int position = findContact(contact);
        if(position == -1){
            //System.out.println("Contact " + contact.getName() + " added to your contacts!");
            return myContacts.add(contact);
        }else{
            //System.out.println("Contact " + contact.getName() + " already exists!");
            return false;
        }
    }

    public boolean updateContact(Contact oldContact, Contact newContact){
        int position = findContact(oldContact);
        if(position >= 0){
            return myContacts.remove(oldContact) && myContacts.add(newContact);
        }else{
            return false;
        }
    }

    public boolean removeContact(Contact contact){
        int position = findContact(contact);
        if(position >= 0){
            return myContacts.remove(contact);
        }else{
            return false;
        }
    }

    public Contact queryContact(String name){
        int position = findContact(name);
        System.out.println(position);
        if(position >= 0){
            return myContacts.get(position);
        }else{
            return null;
        }
    }

    private int findContact(Contact contact) {
        for (int i = 0; i < myContacts.size(); i++) {
            if (myContacts.get(i).getName().equals(contact.getName())) {
                return i;
            }
        }
        return -1;
    }

    private int findContact(String contactName){
        for (int i = 0; i < myContacts.size(); i++) {
            if(myContacts.get(i).getName() == contactName){
                return i;
            }
        }
        return -1;
    }



    public void printContacts(){
        System.out.println("Contact List:");
        for (int i = 0; i < myContacts.size(); i++) {
            System.out.println(i+1 + ". " + myContacts.get(i).getName() + " -> " + myContacts.get(i).getPhoneNumber());
        }
    }


}


