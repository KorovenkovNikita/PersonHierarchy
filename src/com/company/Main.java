package com.company;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    private static final String empty = "-";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = Integer.parseInt(sc.nextLine());
        Person[] personsInfo = new Person[number];
        for (int i = 0; i < number; i++) {
            String[] line = sc.nextLine().split(" ");
            if (Objects.equals(line[5], empty) && Objects.equals(line[6], empty) &&
                    Objects.equals(line[7], empty) && Objects.equals(line[8], empty)) {
                personsInfo[i] = new HomelessPerson(line);
                continue;
            }
            if (Objects.equals(line[7], empty) && Objects.equals(line[8], empty)) {
                personsInfo[i] = new Student(line);
            }
            if (Objects.equals(line[5], empty) && Objects.equals(line[6], empty)) {
                personsInfo[i] = new Worker(line);
            }
        }
        for (int i = 0; i < number; i++) {
            personsInfo[i].printInformation();
        }
    }
}









