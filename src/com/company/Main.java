package com.company;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Car car=new Car(15,1898);
        Car car2=new Car(24,517);
        Car car3=new Car(33,124);
        Car car4=new Car(42,153);
        Car car5=new Car(51,203);
        DataCar dataCar=new DataCar(2000,"Avensis",5500,"Black-pearl");
        DataCar dataCar2=new DataCar(2008,"Fit",6300,"Black-pearl");
        DataCar dataCar3=new DataCar(2012,"Prius",12000,"White-pearl");
        DataCar dataCar4=new DataCar(2007,"Camry",10000,"Grey-pearl");
        DataCar dataCar5=new DataCar(2003,"Fit",5000,"Blue");

        HashMap<Car, DataCar> maps = new HashMap<>();
        maps.put(car,dataCar);
        maps.put(car2,dataCar2);
        maps.put(car3,dataCar3);
        maps.put(car4,dataCar4);
        maps.put(car5,dataCar5);

        for (Map.Entry abs :maps.entrySet()) {
            System.out.println(abs.getKey()+" "+abs.getValue());
        }
    }
}
