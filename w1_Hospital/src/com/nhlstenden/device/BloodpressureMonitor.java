package com.nhlstenden.device;

public class BloodpressureMonitor extends Device
{
    public BloodpressureMonitor(int serialNumber, int energyConsumptionKwh)
    {
        super(serialNumber, energyConsumptionKwh);
    }

    @Override
    public String getStatus()
    {
        String status = "";
        if(this.getPatient().getBloodpressure().getSystolic() > 120 && this.getPatient().getBloodpressure().getDiastolic() > 80)
        {
            status = "Normal";
        }
        if(this.getPatient().getBloodpressure().getSystolic() >= 140 || this.getPatient().getBloodpressure().getSystolic() < 120 && this.getPatient().getBloodpressure().getDiastolic() > 90 || this.getPatient().getBloodpressure().getDiastolic() < 80)
        {
            status = "Warning";
        }
        if(this.getPatient().getBloodpressure().getSystolic() >= 180 && this.getPatient().getBloodpressure().getDiastolic() >= 110)
        {
            status = "Critical";
        }
        return status;
    }
}
