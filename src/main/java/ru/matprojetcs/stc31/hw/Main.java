package ru.matprojetcs.stc31.hw;

public class Main {
    public static void main(String[] args) {
        PersonArrayFactory paf = new PersonArrayFactory();
        Person[] people = paf.genPersonArray(10000);

        long work1 = sortPeopleArr(people, new PeopleSortBuble());
        long work2 = sortPeopleArr(people, new PeopleSortStream());

        System.out.println("1st algorithm = " + work1);
        System.out.println("2st algorithm = " + work2);
    }

    private static long sortPeopleArr(Person[] people, PeopleSort peopleSort) {
        long startTime = System.currentTimeMillis();
        Object[] sortedPerson = peopleSort.sortPersonArray(people);
        long workTime = System.currentTimeMillis() - startTime;

        for (Object person : sortedPerson) {
            System.out.println(person.toString());
        }

        return workTime;
    }
}
