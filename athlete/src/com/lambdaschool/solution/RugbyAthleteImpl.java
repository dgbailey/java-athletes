package com.lambdaschool.solution;

public class RugbyAthleteImpl implements AthleteServices
{
    String strSport = "Rugby Athlete";

    @Override
    public void displayAthlete()
    {

        System.out.println("*******");
        System.out.println(strSport);
        System.out.println("*******");

    }


}
