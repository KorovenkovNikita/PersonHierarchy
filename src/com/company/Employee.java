package com.company;

public class Employee extends Person {
    private String job;

    public Employee(String[] personInfo) {
        super(personInfo);
        this.job = personInfo[5];
    }
    @Override
    public String generateSayMassage() {
        return super.generateSayMassage()+"Я работаю " + this.job + "." + "\n";
    }
    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;

    }
}
