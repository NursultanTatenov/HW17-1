package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Cow cow1=new Cow(220,14,"male","Fernando");
        Cow cow2=new Cow(140,5,"female","Kusto");
        Cow cow3=new Cow(220,2,"male","Huck");
        Cow cow4=new Cow(120,3,"female","Dofa");
        Cow cow5=new Cow(122,6,"female","Dore");
        Cow cow6=new Cow(187,8,"female","Misol");

        Sheep sheep1=new Sheep(102,5,"male","Champion");
        Sheep sheep2=new Sheep(55,4,"female","Kudrashka");
        Sheep sheep3=new Sheep(44,3,"female","Maruska");
        Sheep sheep4=new Sheep(35,2,"male","Leo");

        Horse horse1=new Horse(350,6,"male","Karazhan","Black");
        Horse horse2=new Horse(250,3,"female","Sary","Brown");
        Horse horse3=new Horse(300,5,"male","Sasha","Grey");

        Sheep[] sheepFarm1={sheep1,sheep2,sheep3};
        Sheep[] sheepFarm2={sheep4};
        Cow[]cowFarm1={cow1,cow2,cow3,cow4,cow5};
        Cow[]cowFarm2={cow6};
        Horse[]horseFarm1={horse1,horse2};
        Horse[]horseFarm2={horse3};

        Farm farm1=new Farm("Spain","Ernesto",cowFarm1,sheepFarm1,horseFarm1);
        Farm farm2=new Farm("Portugal","Pablo",cowFarm2,sheepFarm2,horseFarm2);


        System.out.println(farm1);
        System.out.println(farm2);






    }
}


//                  Тапшырма
//        Класс Cow (weight, age, gender, nickName)
//        Класс Sheep(weight, age, gender, nickName)
//        Класс Horse(weight, age, color, gender, nickName)
//        Класс Farm(address, cows, horses, sheep, OwnerName)
//        2 Farm тузунуз.
//        1-Farmда 3 sheep, 5 cows, 2 horses болсун.
//        2-Farmда 1 sheep, 1 cow, 1 horse болсун.
