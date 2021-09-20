package ru.ssau.tk.name.practice;

public class Person {
    private String firstName;
    private String lastName;
    private int passportId;

    public Person(){
        this.firstName=null;
        this.lastName=null;
        this.passportId=0;
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
        p1.setFirstName("Green");
        p1.setLastName("Nick");
        p2.setPassport(1234567);
        p2.setFirstName("White");
        p2.setLastName("Bob");
        p1.setPassport(7654321);
        System.out.println(p1.getFirstName());
        System.out.println(p1.getLastName());
        System.out.println(p1.getPassport());
        System.out.println(p2.getFirstName());
        System.out.println(p2.getLastName());
        System.out.println(p2.getPassport());
    }
}
