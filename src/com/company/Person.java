package com.company;

public class Person {
    private String name;
    private int age;
    private int height;
    private int weight;

    public Person(String[] personInfo) {
        this.name = personInfo[0];
        this.age = Integer.parseInt(personInfo[1]);
        this.height = Integer.parseInt(personInfo[2]);
        this.weight = Integer.parseInt(personInfo[3]);
    }

    public void say() {
        System.out.println(generateSayMassage());
    }

    protected String generateSayMassage() {
        return  "Меня зовут " + this.name + ", мне " + this.age + " лет." +
                "\n" + "Мой рост " + this.height + " см, а вес " + this.weight + " кг." + "\n";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;

    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;

    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;

    }
}
