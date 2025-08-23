package com.nhlstenden.device;

import com.nhlstenden.patient.Patient;

public abstract class Device
{
    private int serialNumber;
    private int energyConsumptionKwh;
    private Patient patient;

    public Device(int serialNumber, int energyConsumptionKwh)
    {
        this.serialNumber = serialNumber;
        this.energyConsumptionKwh = energyConsumptionKwh;
        this.patient = null;
    }

    public int getSerialNumber()
    {
        return this.serialNumber;
    }

    public void setSerialNumber(int serialNumber)
    {
        this.serialNumber = serialNumber;
    }

    public int getEnergyConsumptionKwh()
    {
        return this.energyConsumptionKwh;
    }

    public void setEnergyConsumptionKwh(int energyConsumptionKwh)
    {
        this.energyConsumptionKwh = energyConsumptionKwh;
    }

    public Patient getPatient()
    {
        return this.patient;
    }

    public void setPatient(Patient patient)
    {
        this.patient = patient;
    }

    public abstract String getStatus();
}
