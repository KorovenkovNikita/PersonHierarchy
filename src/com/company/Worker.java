package com.company;

public class Worker extends Person implements Info {
    private int experience;
    private String education;

    public Worker(String[] personInfo) {
        super(personInfo);
        this.experience = Integer.parseInt(personInfo[7]);
        this.education = personInfo[8];
    }
    public String getInfo(){
        return super.getInfo() + "\n" + "Experience: "+getExperience()+"\n"+"Education: "+getEducation();
    }


    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }
}



