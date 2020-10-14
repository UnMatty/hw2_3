package ru.matprojetcs.stc31.hw;

import java.util.PrimitiveIterator;
import java.util.Random;

public class PersonArrayFactory {
    public Person[] genPersonArray(int capacity) {
        Person[] people = new Person[capacity];
        PrimitiveIterator.OfInt iterator = (new Random()).ints(capacity, 0, 100).iterator();
        for (int i = 0; i < capacity; i++) {
            int age = iterator.nextInt();
            String name = genName();
            Person person = new Person(age, age % 2 == 0 ? Sex.MAN : Sex.WOMAN, name);
            people[i] = person;
        }

        return people;
    }

    private String genName() {
        String lexicon = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Random random = new Random();
        int size = random.nextInt(5) + 5;
        StringBuilder nameBuilder = new StringBuilder();
        for (int i = 0; i < size; i++) {
            nameBuilder.append(lexicon.charAt(random.nextInt(lexicon.length())));
        }

        return nameBuilder.toString();
    }
}
