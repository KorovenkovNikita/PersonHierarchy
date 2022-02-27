package com.company;

public abstract class Person implements Info{
    private String name;
    private String surname;
    private int age;
    private String gender;
    private String cityOfResidence;

    public Person(String[] personInfo) {
        this.name = personInfo[0];
        this.surname = personInfo[1];
        this.age = Integer.parseInt(personInfo[2]);
        this.gender = personInfo[3];
        this.cityOfResidence = personInfo[4];
    }

    @Override
    public void printInformation() {
        System.out.println(getInfo());
    }

    public String getInfo() {
        return "Name: " + getName() + "\n" + "Surname: " + getSurname() + "\n" + "Age: "
                + getAge() + "\n" + "Gender: " + getGender() + "\n" + "City of residence: " + getCityOfResidence();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCityOfResidence() {
        return cityOfResidence;
    }

    public void setCityOfResidence(String cityOfResidence) {
        this.cityOfResidence = cityOfResidence;
    }


}
