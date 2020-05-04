package com.company.aqa.module4.eshop.products;

import com.company.aqa.module4.eshop.products.departments.ProductDepartment;

import java.util.ArrayList;

public class Product implements IProduct {

    private int id;
    private String name;
    private String department;
    private String description;
    private double price;
    private ArrayList<Product> priceList = new ArrayList<>();

    public Product(int id, String name, ProductDepartment productDepartment, String description, double price) {
        this.id = id;
        this.name = name;
        this.department = productDepartment.getDepartmentName();
        this.description = description;
        this.price = price;
    }

    public Product() {

    }

    public void setPriceList(Product product) {
        this.priceList.add(product);
    }

    public ArrayList<Product> getPriceList() {
        return priceList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "name = '" + name + '\'' +
                ", category = '" + department + '\'' +
                ", description = '" + description + '\'' +
                ", price = '" + price + "\n";
    }
}
