package ru.ssau.tk.name.practice.dataType;

import org.testng.annotations.*;

import static org.testng.Assert.*;

public class PersonTest {

    Person one = new Person();
    Person two = new Person();
    Person three = new Person();

    @Test
    public void testOne() {
        one.setFirstName("Jack");
        one.setLastName("Green");
        one.setPassport(123456);

        assertEquals(one.getFirstName(), "Jack");
        assertEquals(one.getLastName(), "Green");
        assertEquals(one.getPassport(), 123456);
    }

    @Test
    public void testTwo() {
        two.setFirstName("Bob");
        two.setLastName("White");
        assertEquals(two.getFirstName(), "Bob");
        assertEquals(two.getLastName(), "White");
    }

    @Test
    public void testThree() {
        three.setPassport(654321);
        assertEquals(three.getPassport(), 654321);
    }

    @Test
    public void testPassportIdConstructor() {
        Person p1 = new Person(3455328);
        assertEquals(p1.getPassport(), 3455328);
    }

    @Test
    public void testNameContructor() {
        Person p2 = new Person("Red", "David");
        assertEquals(p2.getFirstName(), "Red");
        assertEquals(p2.getLastName(), "David");
    }

    @Test
    public void testFullConstructor() {
        Person p3 = new Person("Person", "John", 6543221);
        assertEquals(p3.getFirstName(), "Person");
        assertEquals(p3.getLastName(), "John");
        assertEquals(p3.getPassport(), 6543221);
    }

    @Test
    public void testGetGender() {
        Person p4 = new Person("Wolf", "Rube", 7654322, Gender.FEMALE);
        Person p5 = new Person("Parker", "Peter", 567892, Gender.MALE);
        assertEquals(p4.getGender(), Gender.FEMALE);
        assertEquals(p5.getGender(), Gender.MALE);
    }

    @Test
    public void testSetGender() {
        one.setGender(Gender.FEMALE);
        two.setGender(Gender.MALE);
    }

    @Test
    public void testToString() {
        Person four = new Person("Blabla", "Blabla");
        assertEquals(four.toString(), "Blabla Blabla");
    }
}