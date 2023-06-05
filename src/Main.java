public class Main {

    public static void main(String[] args) {

        MobilePhone myPhone = new MobilePhone("Nokia");
        Contact bob = new Contact("Bob", "123");
        Contact alice = new Contact("Alice", "456");
        Contact tom = new Contact("Tom", "789");
        Contact mike = new Contact("Mike", "159");
        myPhone.addNewContact(bob);
        myPhone.addNewContact(alice);
        myPhone.addNewContact(tom);
        myPhone.printContacts();
        myPhone.updateContact(bob, mike);
        myPhone.printContacts();
        myPhone.removeContact(mike);
        myPhone.printContacts();
        myPhone.queryContact("Tom");


    }
}
