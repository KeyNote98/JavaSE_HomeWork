package com.company.Basketball;

public class Coach extends People implements Organization {
    public Coach(String name, int overall, boolean hand, Team team) {
        super(name, overall, hand, team);
    }

    @Override
    public boolean scouting(People people, Team team) {
        if(people.getTeam() == team)
            return true;
        else
            return false;
    }

    @Override
    public void trade(People people1, People people2) {
        System.out.print("It is not in my competence \n");
    }

    public void training(People people){
        people.setOverall(people.getOverall() + 1);
    }
}
