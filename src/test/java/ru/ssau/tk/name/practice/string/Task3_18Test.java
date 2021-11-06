package ru.ssau.tk.name.practice.string;

import org.testng.annotations.Test;
import ru.ssau.tk.name.practice.dataType.NamePoint;
import ru.ssau.tk.name.practice.dataType.Person;
import ru.ssau.tk.name.practice.dataType.Point;

public class Task3_18Test {
    @Test
    public void testDescriptionOfObjects() {
        Person person = new Person("Blabla", "Bla");
        Point point = new Point(1, 3, 5);
        NamePoint namePoint = new NamePoint(1, 3, 5, "Point");
        System.out.println(Task3_18.descriptionOfObjects(person));
        System.out.println(Task3_18.descriptionOfObjects(point));
        System.out.println(Task3_18.descriptionOfObjects(namePoint));
    }
}
