package ru.matprojetcs.stc31.hw;

import java.util.Arrays;

public class PeopleSortStream implements PeopleSort {
    public Object[] sortPersonArray(Person[] people){
        return Arrays.stream(people).sorted(new PeopleComparator()).toArray();
    }
}
