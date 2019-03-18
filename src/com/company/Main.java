package com.company;
import com.company.Basketball.*;


public class Main {

    public static void main(String[] args) {
        Team BS = new Team("Boston Celtics", 50);
        Team GSW = new Team("Golden State Warriors", 73);
        Team LSL = new Team("Los Angeles Lakers", 41);
        People Irving = new Guard("Irving",88, true, BS);
        ((Guard) Irving).defense();
        ((Guard) Irving).dribbl();
        ((Guard) Irving).shoot();
        People Curry = new Guard("Curry", 90, true, GSW);
        System.out.println(Irving.equals(Curry));
        System.out.println(Irving.getName() + "'s hashCode is " + Irving.hashCode() + " and " + Curry.getName() + "'s hashCode is " + Curry.hashCode());
        Irving.talk(Curry);
        People LeBron = new Forward("LeBron",99,true, LSL);
        ((Forward) LeBron).shoot();
        ((Forward) LeBron).dribbl();
        ((Forward) LeBron).defense();
        System.out.println(LeBron.getName() + "'s hashCode is " + LeBron.hashCode());
        LeBron.talk(Irving);
        People Ainge = new GeneralManager("Ainge", 90, true, BS);
        Ainge.talk(Irving);
        System.out.println(LeBron.getName() + " in Boston Celtics? - " + ((GeneralManager) Ainge).scouting(LeBron, BS));
        People Kerr = new Coach("Kerr", 95, true, GSW);
        System.out.println(Curry.getName() + "'s overoll is " + Curry.getOverall());
        ((Coach) Kerr).training(Curry);
        System.out.println(Curry.getName() + "'s overoll is " + Curry.getOverall());
        ((GeneralManager) Ainge).trade(LeBron, Irving);
        System.out.println(LeBron.getName() + "'s new team is " + LeBron.getTeam().getName());
        System.out.println(Irving.getName() + "'s new team is " + Irving.getTeam().getName());
        ((Coach) Kerr).trade(Curry, Irving);
        System.out.println(Kerr.getName() + "'s hashCode is " + Kerr.hashCode());
    }
}
