package com.company;

public class Ball {
    private String color;
    private String name;
    private int capacity;
    private int bounceRate;


    public Ball()
    {

    }

    public Ball(String mcolor, String mname, int mcapacity, int mbounceRate) {
        color = mcolor;
        name = mname;
        capacity = mcapacity;
        bounceRate = mbounceRate;
    }
    public Ball(String mcolor,String mname){
        color=mcolor;
        name=mname;

    }
    public Ball(String mcolor,String mname,int mcapacity){
        color=mcolor;
        name=mname;
        capacity=mcapacity;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getBounceRate() {
        return bounceRate;
    }

    public void setBounceRate(int bounceRate) {
        this.bounceRate = bounceRate;
    }



    public void showcolor(){
        System.out.println(color);
    }
public void showname()
{
    System.out.println(name);
}

    public void bounce(){
        System.out.println("bouncing");
    }
    public void deflate(){
        System.out.println("deflating");
    }
    public void inflate(){
        System.out.println("inflating");
    }
}
