package com.company;


import java.util.Collections;

import static java.lang.System.*;

public class Main {

    public static void main(String[] args) {
       //The initial students
        Student s1 = new Student("Asaf", "Asafski", 1111,"051-111-111");
        Student s2 = new Student("Beni", "Benski", 2222,"052-222-222");
        Student s3 = new Student("Dima", "Dimski", 4444,"054-444-444");
        //array of students
        Student[] students = new Student[] { s1, s2, s3 };
        //array of phone numbers
        String[] phoneNumbers = new String[] {s1.phoneNumber(),s2.phoneNumber(),s3.phoneNumber()};
       //the association table
        AssociationTable<Student, String> table = new AssociationTable<>(students, phoneNumbers);

        show(table,"The initial 3 students (Asasf, Beni & Dima) and their phone numbers");

        //the new student
        Student s4 = new Student("Carlos", "Carlski", 3333,"053-333-333");

        //adding the new student
        table.add(new Tuple<>(s4, s4.phoneNumber()));
        show(table,"new student is put in the right place");

        //removing student
        table.remove(s2);
        show(table, "Beni removed");


    }

    private static void show(AssociationTable<Student, String> table, String msg) {
        out.println(msg);
        for (int i = 0; i < table.size(); i++) {
            out.println(table.get(i).toString());
        }
        out.println();
    }


}
