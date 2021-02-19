package HomeTask10;

import java.util.*;

public class Main {
    public static void main(String[] args){
        List<String> wordslist = Arrays.asList("Кофе", "Молоко", "Вода", "Сок", "Газировка",
                "Вода", "Кофе", "Пиво", "Сок", "Чай",
                "Вода", "Газировка", "Велосипед", "Кошка", "Котлеты",
                "Дом", "Вода", "Котлеты", "Котлеты", "Дом");
        Set<String> unique = new HashSet<String>(wordslist);
        System.out.println("Уникальные слова");
        System.out.println(unique.toString());
        System.out.println("Частота встречаемости слов");
        for (String f : unique) {
            System.out.println(f + ": " + Collections.frequency(wordslist, f));
        }

        PhoneBook phonebook = new PhoneBook();
        phonebook.add("Петров", "+789453ф1234");
        phonebook.add("Петров", "+70987903а09");
        phonebook.add("Иванов", "+7923871в977");
        phonebook.add("Петичкин", "+76942о148в");
        phonebook.add("Васечкин", "+73917135а78");
        System.out.println(phonebook.get("Петров"));
        System.out.println(phonebook.get("Иванов"));
    }
}
