package com.lambdaschool.solution;

import com.lambdaschool.initial.MyApplication;

public class myApplication implements Processor

{
    private AthleteServices athServ;

    public myApplication(AthleteServices athServ)
    {
        this.athServ = athServ;
    }

    public void displayAthlete()
    {
        athServ.displayAthlete();
    }




}
