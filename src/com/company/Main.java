package com.company;

public class Main {

    public static void main(String[] args) {
	//Ball ball=new Ball("blue","justball",12,45);
        Ball ball=new Ball();
        Ball myball=new Ball("Black","another ball");
	ball.setName("hello");
	ball.setColor("RED");
	ball.setBounceRate(435);
	ball.setCapacity(3);

	//ball.showcolor();
        System.out.println(ball.getName()+","+ball.getColor()+","+ball.getBounceRate()+","+ball.getCapacity());

    }
}
