package com.company.Basketball;

public class GeneralManager extends People implements Organization {
    public GeneralManager(String name, int overall, boolean hand, Team team) {
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
        Team team = people1.getTeam();
        people1.setTeam(people2.getTeam());
        people2.setTeam(team);
    }
}
