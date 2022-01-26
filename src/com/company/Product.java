package com.company;

import java.io.Serializable;

public class Product implements Serializable {
    private String Code;
    private String name;
    private String brand;
    private String price;
    private String description;

    public Product(String code, String name, String brand, String price, String description) {
        this.Code = code;
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.description = description;
    }

    public Product() {
    }

    public String getCode() {
        return Code;
    }

    public void setCode(String code) {
        Code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Product{" +
                "Code='" + Code + '\'' +
                ", name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", price='" + price + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
