package HomeWorkFive;

import java.lang.reflect.Array;
import java.util.*;

public class PhoneBook {
    private HashMap<String, ArrayList<Integer>> phoneBook = new HashMap<>();

    public HashMap<String,ArrayList<Integer>> getPhoneBook(){
        return this.phoneBook;
    }
    public void CreateContact(int sizeContact){
        int count = 0;
        boolean findContact = false;
        while (count < sizeContact) {
            String name = InputUser.InputUser("Введите имя: ");
            Integer phone = Integer.parseInt(InputUser.InputUser("Введите телефон: "));
            for (Map.Entry<String, ArrayList<Integer>> item : phoneBook.entrySet()) {
                if (item.getKey().toLowerCase().equals(name.toLowerCase())) {
                    item.getValue().add(phone);
                    findContact = true;
                    break;
                }
            }
            if (!findContact) {
                ArrayList<Integer> list = new ArrayList<>();
                list.add(phone);
                phoneBook.put(name, list);
            }
            findContact = false;
            count++;
        }
    }

    public void phoneBookShow(){
        for (Map.Entry<String, ArrayList<Integer>> item: this.phoneBook.entrySet()){
            System.out.println(item.getKey() + " : " + item.getValue() + "\n");
        }
    }

}

