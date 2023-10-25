package com.example.ecostore.models;

import com.google.firebase.firestore.PropertyName;

public class NewProductsModel {

    @PropertyName("description")
    private String description;
    @PropertyName("img_url")
    private String img_url;
    @PropertyName("name")
    private String name;
    @PropertyName("rating")
    private String rating;
    @PropertyName("price")
    private int price;


    public NewProductsModel() {
        // Default constructor (required by some libraries)
    }

    public NewProductsModel(String description, String name, String rating, int price, String img_url) {
        this.description = description;
        this.img_url = img_url;
        this.name = name;
        this.rating = rating;
        this.price = price;

    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public String getImg_url() {
        return img_url;
    }

    public void setImg_url(String img_url) {
        this.img_url = img_url;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


}
