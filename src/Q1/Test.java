package Q1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by İbrahim Başar YARGICI at 2.07.2021
 */
public class Test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfEntries = scanner.nextInt();
        scanner.nextLine();

        List<PhoneBook> phoneBooks = getRecord(numOfEntries);

        List<String> names = getQueries(numOfEntries);

        searchPhoneBook(phoneBooks, names);
    }

    public static void searchPhoneBook(List<PhoneBook> phoneBooks, List<String> names) {
        boolean found;

        for (PhoneBook book: phoneBooks) {
            String tempName = (book.getFirstName() + " " + book.getSecondName()).trim();
            found = false;
            if (names.contains(tempName)) {
                found = true;
                System.out.println(tempName + "=" + book.getPhoneNumber());
            }
            if (!found) {
                System.out.println("Not found");
            }
        }
    }

    public static List<String> getQueries(int numOfEntries) {
        List<String> names = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < numOfEntries; i++) {
            names.add(scanner.nextLine());
        }

        return names;
    }

    public static List<PhoneBook> getRecord(int numOfEntries) {
        Scanner scanner = new Scanner(System.in);
        List<PhoneBook> phoneBooks = new ArrayList<>();
        String[] splitArr;
        String name;

        for (int i = 0; i < numOfEntries; i++) {
            PhoneBook phoneBook = new PhoneBook();
            name = scanner.nextLine();

            if (name.contains(" ")) {
                splitArr = name.split("\\s+"); // splits string when see a whitespace
                phoneBook.setFirstName(splitArr[0]);
                phoneBook.setSecondName(splitArr[1]);
            } else {
                phoneBook.setFirstName(name);
                phoneBook.setSecondName("");
            }
            phoneBook.setPhoneNumber(scanner.nextLine());
            phoneBooks.add(phoneBook);
        }

        return phoneBooks;
    }
}