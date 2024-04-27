package com.example.furniture.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name  = "Furniture_DataBase")
public class Furniture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int Id ;
    @Column(name = "Product_Name")
    String Product_name;
    @Column(name = "Product_category")
    String Product_Category;
    @Column(name = "Product_Cost")
    int Product_Cost;
    
    public Furniture() {
    }
    public Furniture(int id, String product_name, String product_Category, int product_Cost) {
        Id = id;
        Product_name = product_name;
        Product_Category = product_Category;
        Product_Cost = product_Cost;
    }
    public int getId() {
        return Id;
    }
    public void setId(int id) {
        Id = id;
    }
    public String getProduct_name() {
        return Product_name;
    }
    public void setProduct_name(String product_name) {
        Product_name = product_name;
    }
    public String getProduct_Category() {
        return Product_Category;
    }
    public void setProduct_Category(String product_Category) {
        Product_Category = product_Category;
    }
    public int getProduct_Cost() {
        return Product_Cost;
    }
    public void setProduct_Cost(int product_Cost) {
        Product_Cost = product_Cost;
    }
    
   
    
}
