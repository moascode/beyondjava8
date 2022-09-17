package com.moascode.beyondjava8.java9;

import com.moascode.beyondjava8.misc.Person;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *<pre>'of' method in the List, Set, and Map interface return an immutable collection that is not modifiable.
 *The object in the collection must be immutable to achieve full immutability</pre>
*/
public final class ImmutableCollection {
    static void iList() {
        List<String> list = List.of("First", "Second", "Third");
        /*not possible*/
        //list.add("Fourth");
        System.out.println("List: " + list);
        Person person = new Person("Max", 20, 1000);
        List<Person> objectList = List.of(person);
        person.setSalary(2000); //changed
        objectList.stream().findFirst().get().setAge(22); //changed
        //objectList.set(0, new Person("Pro max", 22, 500)); //can not be changed
        System.out.println("Object List: " + objectList);
    }

    static void iSet() {
        Set<String> set = Set.of("First", "Second", "Third");
        System.out.println("Set: " + set);
    }

    static void iMap() {
        Map<String, String> map = Map.of("1", "First", "2", "Second");
        System.out.println("Map: " + map);
    }
}
