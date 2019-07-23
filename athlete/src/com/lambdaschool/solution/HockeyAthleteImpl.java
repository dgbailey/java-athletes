package com.lambdaschool.solution;

public class HockeyAthleteImpl implements AthleteServices
{
    String strSport = "Hockey Goalie";

    @Override
    public void displayAthlete()
    {
        System.out.println("*******");
        System.out.println(strSport);
        System.out.println("*******");
    }


}
