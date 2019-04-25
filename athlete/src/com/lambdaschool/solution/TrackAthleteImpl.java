package com.lambdaschool.solution;

public class TrackAthleteImpl implements AthleteServices
{
    String strSport = "Track Runner";

    @Override
    public void displayAthlete()
    {
        System.out.println("*******");
        System.out.println(strSport);
        System.out.println("*******");
    }


}
