package com.company.aqa.module4.eshop.products;

public class Product<T, P> implements IProduct<T>{

    private T id;
    private double price;

    public Product(T id, double price) {
        this.id = id;
        this.price = price;
    }

    @Override
    public T getId() {
        return null;
    }
}
