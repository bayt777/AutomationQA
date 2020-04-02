package com.company.aqa.module4.autoshow;

import com.company.aqa.module4.autoshow.constatns.BodyType;
import com.company.aqa.module4.autoshow.constatns.Brand;

public class Main {

    public static void main(String[] args) {

        Car myCar = new Car(Brand.BMW, "X5", BodyType.CROSSOVER, 2015,4,4.5,5,20,10000);
        Car myCar1 = new Car(Brand.BMW, "X6", BodyType.ROADSTER, 2017,4,4.5,3,10,20000);
        Car myCar2 = new Car(Brand.Audi, "A1", BodyType.SUPERMINI, 2017,4,1.5,3,2,3000);


        AutoShow myShow = new AutoShow();
        myShow.addAuto(myCar);
        myShow.addAuto(myCar1);
        myShow.addAuto(myCar2);

        myShow.printListOfCar();

        myShow.findCarByBrand(Brand.BMW);
    }
}
