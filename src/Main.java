import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final MobilePhone phoneContacts = new MobilePhone();


    public static void main(String[] args){

        boolean quit = false;
        int choice;
        printInsturctions();
        while(!quit){
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();


            switch (choice) {
                case 0 -> printInsturctions();
                case 1 -> phoneContacts.printContacts();
                case 2 -> addContact();
                case 3 -> modifyContact();
                case 4 -> removeContact();
                case 5 -> searchForContact();
                case 6 -> quit = true;
            }
        }
    }



    private static void searchForContact() {
        System.out.println();
    }

    private static void removeContact() {
    }

    private static void modifyContact() {
    }

    private static void addContact() {
        System.out.println("Please enter contact name: ");
        String name =scanner.next();
        System.out.println("Please enter contact phone number: ");
        String phoneNumber = scanner.next();
        Contacts newcontact = Contacts.createContact(name,phoneNumber);
        if (phoneContacts.addContacts(newcontact)){
            System.out.println("New contact added --> name: "+ name + ", phone = "+ phoneNumber);
        }else {
            System.out.println("Cannot add, " + name + " already on file");
        }

    }

    private static void printInsturctions() {
        System.out.println("\nPress");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list of contacts.");
        System.out.println("\t 2 - To add an item to the contacts list.");
        System.out.println("\t 3 - To modify an item in the contacts list.");
        System.out.println("\t 4 - To remove an item from the contacts list");
        System.out.println("\t 5 - To search for an item in the contacts list.");
        System.out.println("\t 6 - To quit the application.");
    }
}
