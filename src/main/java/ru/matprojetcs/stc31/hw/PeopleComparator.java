package ru.matprojetcs.stc31.hw;

import java.util.Comparator;

public class PeopleComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        if (o1.getSex().equals(o2.getSex())) {
            if (o1.getAge() == o2.getAge())
                if (o1.getName().equals(o2.getName()))
                    throw new PersonSortException("Одинаковые люди " + o1.toString() + " " + o2.toString());
                else
                    return o1.getName().compareTo(o2.getName());
            else if (o1.getAge() > o2.getAge()) {
                return 1;
            } else
                return -1;
        } else if (o1.getSex().equals(Sex.WOMAN))
            return 1;
        else
            return -1;
    }
}
