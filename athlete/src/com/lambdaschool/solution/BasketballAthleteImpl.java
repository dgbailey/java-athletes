package com.lambdaschool.solution;

public class BasketballAthleteImpl implements AthleteServices
{
    String strSport = "Basketball Athlete";

    @Override
    public void displayAthlete()
    {
        System.out.println("*******");
        System.out.println(strSport);
        System.out.println("*******");
    }


}
