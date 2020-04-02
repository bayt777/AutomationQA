package com.company.aqa.module4.autoshow;

import com.company.aqa.module4.autoshow.constatns.BodyType;
import com.company.aqa.module4.autoshow.constatns.Brand;

import java.util.Objects;

public class Car {

    private Brand brand;
    private String model;
    private String bodyType;
    private int yearOfIssue;
    private int passengerCapacity;
    private double engineCapacity;
    private int enginePower;
    private double fuelConsumption;
    private double cost;

    /**
     * @param brand             {@link Brand}
     * @param model             model
     * @param bodyType          {@link BodyType}
     * @param yearOfIssue       year of create car
     * @param passengerCapacity passengerCapacity
     * @param engineCapacity    engineCapacity
     * @param enginePower       enginePower
     * @param fuelConsumption   fuelConsumption
     * @param cost              cost
     */
    public Car(Brand brand, String model, String bodyType, int yearOfIssue, int passengerCapacity, double engineCapacity, int enginePower, double fuelConsumption, int cost) {
        this.brand = brand;
        this.model = model;
        this.bodyType = bodyType;
        this.yearOfIssue = yearOfIssue;
        this.passengerCapacity = passengerCapacity;
        this.engineCapacity = engineCapacity;
        this.enginePower = enginePower;
        this.fuelConsumption = fuelConsumption;
        this.cost = cost;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(int yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return yearOfIssue == car.yearOfIssue &&
                passengerCapacity == car.passengerCapacity &&
                Double.compare(car.engineCapacity, engineCapacity) == 0 &&
                enginePower == car.enginePower &&
                Double.compare(car.fuelConsumption, fuelConsumption) == 0 &&
                Double.compare(car.cost, cost) == 0 &&
                Objects.equals(brand, car.brand) &&
                Objects.equals(model, car.model) &&
                Objects.equals(bodyType, car.bodyType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, bodyType, yearOfIssue, passengerCapacity, engineCapacity, enginePower, fuelConsumption, cost);
    }

    @Override
    public String toString() {
        return "\n" +
                "brand=" + brand +
                "\nmodel='" + model + '\'' +
                "\nbodyType='" + bodyType + '\'' +
                "\nyearOfIssue=" + yearOfIssue +
                "\npassengerCapacity=" + passengerCapacity +
                "\nengineCapacity=" + engineCapacity +
                "\nenginePower=" + enginePower +
                "\nfuelConsumption=" + fuelConsumption +
                "\ncost=" + cost +
                "\n";
    }
}
