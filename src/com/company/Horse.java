package com.company;

public class Horse extends AbstractAnimal{
    private String color;

    public Horse(int weight, int age, String gender, String nickName,String color){
        super(weight,age,gender,nickName);
        this.color=color;
    }

    @Override
    public String toString() {
        return "\nnickName=" + nickName +", weight=" + weight + ", age=" + age + ", gender='" + gender+", color='" + color;


    }
}