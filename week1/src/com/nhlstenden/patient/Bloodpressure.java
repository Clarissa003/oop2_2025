package com.nhlstenden.patient;

public class Bloodpressure
{
    private int systolic;
    private int diastolic;

    public Bloodpressure(int systolic, int diastolic)
    {
        this.systolic = systolic;
        this.diastolic = diastolic;
    }

    public int getSystolic()
    {
        return this.systolic;
    }

    public void setSystolic(int systolic)
    {
        this.systolic = systolic;
    }

    public int getDiastolic()
    {
        return this.diastolic;
    }

    public void setDiastolic(int diastolic)
    {
        this.diastolic = diastolic;
    }
}
