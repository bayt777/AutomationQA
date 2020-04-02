package com.company.aqa.module4.autoshow;

import com.company.aqa.module4.autoshow.constatns.Brand;

import java.util.ArrayList;

public class AutoShow {

    private ArrayList<Car> myAutoShows;

    public AutoShow() {
        this.myAutoShows = new ArrayList<>();
    }

    public String addAuto(Car car) {
        this.myAutoShows.add(car);
        return car + " -------------- added!--------------";
    }

    public void printListOfCar() {
        int i = 1;
        for (Car car : myAutoShows) {
            System.out.println(i++ + "-------------" + car.toString() + "------------");
        }
    }

    public void findCarByBrand(Brand brand) {
        ArrayList<Car> found = new ArrayList<>();
        for (Car search : this.myAutoShows) {
            if (search.getBrand().equals(brand)) {
                found.add(search);
            }
        }
        for (Car car : found) {
            System.out.println(car.toString());
        }
    }
}
