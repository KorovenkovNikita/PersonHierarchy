package com.company;


public class Student extends Person {
    private Course study;

    public Student(String[] personInfo) {
        super(personInfo);
        this.study = Course.valueOf(personInfo[4]);
    }

    public enum Course {
        FIRST("1 курсе бакалавра"),
        SECOND("2 курсе бакалавра"),
        THIRD("3 курсе бакалавра"),
        FOURTH("4 курсе бакалавра"),
        FIFTH("1 курсе магистратуры"),
        SIXTH("2 курсе магистратуры");
        private final String nameCourse;

        private Course(String nameCourse) {
            this.nameCourse = nameCourse;
        }

        public String toString() {
            return this.nameCourse;
        }
    }

    @Override
    public String generateSayMassage() {
        return super.generateSayMassage() + "Я учусь на " + getStudy() + "." + "\n";
    }

    public Course getStudy() {
        return study;
    }

    public void setStudy(String study) {
        this.study = Course.valueOf(study);

    }
}
