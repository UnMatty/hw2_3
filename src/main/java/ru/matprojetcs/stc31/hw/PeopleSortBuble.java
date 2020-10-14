package ru.matprojetcs.stc31.hw;

public class PeopleSortBuble implements PeopleSort {
    public Object[] sortPersonArray(Person[] people){
        boolean wasChange;
        do {
            wasChange = false;
            for (int i = 0; i < people.length; i++) {
                if (i == 0)
                    continue;

                Person o1 = people[i - 1];
                Person o2 = people[i];

                PeopleComparator peopleComparator = new PeopleComparator();
                if (peopleComparator.compare(o1, o2) > 0) {
                    people[i - 1] = o2;
                    people[i] = o1;
                    wasChange = true;
                }
            }
        } while (wasChange);
        return people;
    }
}
