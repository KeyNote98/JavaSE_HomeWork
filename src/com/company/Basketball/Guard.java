package com.company.Basketball;

public class Guard extends People implements Player{
    public Guard(String name, int overall, boolean hand, Team team) {
        super(name, overall, hand, team);
    }

    @Override
    public void shoot() {
        System.out.print("My jumpshot is good and I can do 3'point shoot \n");
    }

    @Override
    public void dribbl() {
        System.out.print("My dribbling is very good \n");
    }

    @Override
    public void defense() {
        System.out.print("I am clever defender, bat I can't do blockshots \n");
    }
}
