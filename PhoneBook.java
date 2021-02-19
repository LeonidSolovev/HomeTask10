package HomeTask10;


    import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class PhoneBook {

        private HashMap<String, List<String>> book;

        public PhoneBook(){
            this.book = new HashMap<>();
        }

        public void add(String name, String number){
            if(book.containsKey(name)){
                List<String> numbers = book.get(name);
                if(!numbers.contains(number)){
                    numbers.add(number);
                    } else {
                    System.out.println("Номер уже существует");
                }
            } else {
                book.put(name, new ArrayList<>(Arrays.asList(number)));

            }
        }

        public List<String> get(String name){
            if(book.containsKey(name)){
                return book.get(name);
            } else {
                System.out.println("В справочнике нет такого человека");
                return new ArrayList<>();
            }
        }
}

