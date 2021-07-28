import java.util.ArrayList;
import java.util.HashMap;

public class PhoneBook {
    private HashMap<String, ArrayList<String>> phoneBook = new HashMap<>();

    public void add(String lastName, String phoneNumber) {
        ArrayList<String> phonesForLastName = phoneBook.getOrDefault(lastName, new ArrayList<>());
        phonesForLastName.add(phoneNumber);
        phoneBook.put(lastName, phonesForLastName);
    }

    public ArrayList<String> get(String lastName){
        ArrayList<String> result = phoneBook.get(lastName);
        if (result == null){
            System.out.println("Такое имя не найдено в телефонной книге");
        }
        return result;
    }

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Petrov", "88005553535");
        phoneBook.add("Petrov1", "456687486");
        phoneBook.add("Petrov2", "171681");
        phoneBook.add("Petrov3", "787876878");
        phoneBook.add("Petrov", "44444444");

        System.out.println(phoneBook.get("Petrov1313"));
    }
}
