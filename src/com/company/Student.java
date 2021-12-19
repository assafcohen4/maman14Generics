package com.company;

import static java.lang.Integer.compare;

// I'm using the new Java record syntax, saves a lot of boilerplate code
public record Student(String firstName,String lastName, int id, String phoneNumber)
        implements Comparable<Student> {
    @Override
    public int compareTo(Student o) {
        return compare(id, o.id);
    }
    @Override
    public String toString() {
        return firstName + ", " + lastName +", " + id;
    }
}

