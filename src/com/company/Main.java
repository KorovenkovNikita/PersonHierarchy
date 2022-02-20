package com.company;

import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        Person[] persons = new Person[N];
        for (int i = 0; i < N; i++) {
            String[] line = sc.nextLine().split(";");
            if (Objects.equals(line[4], "-") && Objects.equals(line[5], "-")) {
                persons[i] = new Person(line);
                continue;
            }
            if (Objects.equals(line[4], "-")) {
                persons[i] = new Employee(line);
            }
            if (Objects.equals(line[5], "-")) {
                persons[i] = new Student(line);
            }
        }
        for (int i = 0; i < N; i++) {
            persons[i].say();
        }
    }
}







