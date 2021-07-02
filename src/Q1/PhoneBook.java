package Q1;

/**
 * Created by İbrahim Başar YARGICI at 2.07.2021
 */
public class PhoneBook {
    private String firstName;
    private String secondName;
    private String phoneNumber;

    public PhoneBook() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName.toLowerCase();
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName.toLowerCase();
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
