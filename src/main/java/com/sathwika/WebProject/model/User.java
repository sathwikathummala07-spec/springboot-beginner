package com.sathwika.WebProject.model;

public class User{
    private String name;
    private String image;
    private String gender;
    private Integer id;

    public User(){

    }
    public User(String name,String image,String gender,Integer id){
        this.name = name;
        this.image = image;
        this.gender = gender;
        this.id = id;
    }
    public String getName(){
        return this.name;
    }
    public String getImage(){
        return this.image;
    }
    public String getGender(){
        return this.gender;
    }
    public Integer getId(){
        return this.id;
    }
    public void setName(String Name){
        this.name=Name;
    }
    public void setImage(String Image){
        this.image=Image;
    }
    public void setGender(String Gender){
        this.gender=Gender;
    }
    public void setId(Integer Id){
        this.id=Id;
    }
}