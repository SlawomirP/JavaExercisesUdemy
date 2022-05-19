package library;

public class Author {

    String firstName;
    String lastName;

    public Author(String name, String surname) {
        this.firstName = name;
        this.lastName = surname;
    }

    public String getInfo(){
        return firstName + " " + lastName;
    }


}
