package com.company;

public class Student extends Person implements Info {
    private int course;
    private String specialization;

    public Student(String[] personInfo) {
        super(personInfo);
        this.course = Integer.parseInt(personInfo[5]);
        this.specialization = personInfo[6];
    }

    public String getInfo(){
        return super.getInfo()+"\n"+"Course: "+getCourse()+"\n"+"Specialization: "+getSpecialization();
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

}