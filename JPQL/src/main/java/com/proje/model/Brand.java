package com.proje.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Brand implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int brandId;

    private String name;

    @OneToMany(mappedBy = "brand")
    private List<Product> products;

    public Brand(){

    }

    @Override
    public String toString() {
        return "Brand{" +
                "brandId=" + brandId +
                ", name='" + name + '\'' +
                ", products=" + products +
                '}';
    }

    public Brand(String name) {
        this.name = name;
    }

    public int getBrandId() {
        return brandId;
    }

    public void setBrandId(int brandId) {
        this.brandId = brandId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
