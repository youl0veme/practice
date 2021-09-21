package ru.ssau.tk.name.practice;

public class Person {
    private String firstName;
    private String lastName;
    private int passportId;

    public Person(String firstName, String lastName, int passportId){
        this.firstName=firstName;
        this.lastName=lastName;
        this.passportId=passportId;
    }
    public Person(){
    }

    public Person(String firstName, String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
    }

    public Person(int passportId){
        this.passportId=passportId;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPassport(int passport) {
        this.passportId = passport;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getPassport() {
        return passportId;
    }
    public static void main (String[] args) {
        Person p1 = new Person();
        Person p2 = new Person();
        Person p3 = new Person();
        Person p4 = new Person();
        p3.setPassport(6545383);
        p1.setFirstName("Green");
        p1.setLastName("Nick");
        p2.setFirstName("White");
        p2.setLastName("Bob");
        p1.setPassport(7654321);
    }
}
