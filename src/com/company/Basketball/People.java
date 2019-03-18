package com.company.Basketball;

import java.util.Objects;

public abstract class People{
    private String name;
    private int overall;
    private String hand;
    private Team team;
    public People(String name, int overall, boolean hand, Team team) {
        this.name = name;
        this.overall = overall;
        if(hand)
            this.hand = "Right";
        else
            this.hand = "Left";
        this.team = team;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOverall() {
        return overall;
    }

    public void setOverall(int overall) {
        this.overall = overall;
    }

    public String getHand() {
        return hand;
    }

    public void setHand(String hand) {
        this.hand = hand;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof People)) return false;
        People people = (People) o;
        return overall == people.overall &&
                Objects.equals(name, people.name) &&
                Objects.equals(hand, people.hand) &&
                Objects.equals(team, people.team);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, overall, hand, team);
    }

    public void talk(People people) {
        System.out.print("Hi mr." + people.getName() + "\n");
    }
}
