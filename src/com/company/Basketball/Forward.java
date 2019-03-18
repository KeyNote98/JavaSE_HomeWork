package com.company.Basketball;

public class Forward extends People implements Player {
    public Forward(String name, int overall, boolean hand, Team team) {
        super(name, overall, hand, team);
    }

    @Override
    public void shoot() {
        System.out.print("My jumpshot is good and i can dank \n");
    }

    @Override
    public void dribbl() {
        System.out.print("My dribbling is bad, but I have very big first step \n");
    }

    @Override
    public void defense() {
        System.out.print("I can do blockshots \n");
    }
}
