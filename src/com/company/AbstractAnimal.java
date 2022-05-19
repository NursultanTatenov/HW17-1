package com.company;

public abstract class AbstractAnimal {

    public int weight;
    public int age;
    public String gender;
    public String nickName;

    public AbstractAnimal(int weight, int age, String gender, String nickName) {
        this.weight = weight;
        this.age = age;
        this.gender = gender;
        this.nickName = nickName;
    }

    @Override
    public String toString() {
        return "\nnick Name=" + nickName +", weight=" + weight + ", age=" + age + ", gender='" + gender+" ";
    }
}
