package com.example.ecostore.models;

import com.google.firebase.firestore.PropertyName;

public class CategoryModel {
//
//    String img_url;
//    String name;
//    String type;
//
//    public  CategoryModel(String img_url, String name, String type){
//        this.img_url = img_url;
//        this.name = name;
//        this.type = type;
//    }
//
//    public String getImg_url(){
//        return  img_url;
//    }
//
//    public void setImg_url(String img_url){
//        this.img_url = img_url;
//    }
//
//    public String getName(){
//        return  name;
//    }
//
//    public void setName(String name){
//        this.name = name;
//    }
//
//    public  String getType(){
//        return type;
//    }
//    public void setType(String type){
//        this.type = type;
//    }
@PropertyName("img_url")
private String img_url;
    @PropertyName("name")
    private String name;
    @PropertyName("type")
    private String type;

    public CategoryModel() {
        // Required no-argument constructor for Firestore
    }

    public CategoryModel(String img_url, String name, String type) {
        this.img_url = img_url;
        this.name = name;
        this.type = type;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
