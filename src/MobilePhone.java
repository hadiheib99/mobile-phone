import java.util.ArrayList;

public class MobilePhone {
    private ArrayList<Contacts> mobilePhone = new ArrayList<Contacts>();
    private String myNumber;

    public boolean addContacts(Contacts newContacts){
        if(findContactPos(newContacts.getName())>=0){
            System.out.println("Contact is already on file");
            return false;
        }
        mobilePhone.add(newContacts);
        return true;
    }
    public void printContacts(){
        System.out.println("contacts list");
        for (int i =0;i<this.mobilePhone.size();i++){
            System.out.println((i+1) + ". "+this.mobilePhone.get(i).getName() + " --> "+
                    this.mobilePhone.get(i).getPhoneNumber());
        }
    }

    public boolean modifyContactsList(Contacts currentContacts,Contacts newContacts){
        int position = findContactPos(currentContacts);
        if (position >= 0){
            mobilePhone.set(position,newContacts);
            System.out.println("Contact in position "+(position+1) + " has been modified");
            return true;
        }else {
            System.out.println(currentContacts.getName() + " ,was not found");
            return false;
        }
    }
    public String queryContact(Contacts contacts){
        if (findContactPos(contacts)>=0){
            return contacts.getName();
        }
        return null;
    }



    public int findContactPos(Contacts searchItem){

        return this.mobilePhone.indexOf(searchItem);
    }

    public int findContactPos(String contactName)
    {
        for (int i=0;i<this.mobilePhone.size();i++){
            Contacts contacts =this.mobilePhone.get(i);
            if (contacts.getName().equals(contactName)){
                return i;
            }

        }
        return -1;
    }

    public boolean removeContact(Contacts contacts){
        int position = findContactPos(contacts);
        if(position< 0 ){
            System.out.println(contacts.getName()+ " ,was not found");
            return false;
        }
        this.mobilePhone.remove(position);
        System.out.println(contacts.getName() + " ,was deleted!");
        return true;
    }
    private void removeContact(int position){
        mobilePhone.remove(position);
    }



}
