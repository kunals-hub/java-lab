package collectionFramework;

import java.util.HashMap;
import java.util.Map;

// WAP to create a set of contact details where contact number is a key and name as a value and display all key and value.

public class ContactDetails {
    static void main() {
        Map<Long, String> contacts = new HashMap<>();

        contacts.put(9843837834L, "BE Computer HOD");
        contacts.put(9823784523L, "BCA HOD");
        contacts.put(9843897834L, "BBA HOD");
        contacts.put(9823786523L, "BE Civil HOD");

        for (Map.Entry<Long, String> entry : contacts.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        contacts.put(98332372387L, "Principal Office");
        System.out.println(contacts.size());

        contacts.remove(9823786523L);
        System.out.println(contacts.containsKey(9843897834L));
        System.out.println(contacts.get(9843837834L));


    }
}

