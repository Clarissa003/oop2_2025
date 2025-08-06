import java.util.ArrayList;

public class Bed
{
    private Patient patient;
    private ArrayList<Device> devices;

    public Bed()
    {
        this.patient = null;
        this.devices = new ArrayList<>();
    }

    public Patient getPatient()
    {
        return this.patient;
    }

    public void setPatient(Patient patient)
    {
        this.patient = patient;
    }

    public ArrayList<Device> getDevices()
    {
        return this.devices;
    }

    public void setDevices(ArrayList<Device> devices)
    {
        this.devices = devices;
    }

    public void addDevice(Device device)
    {
        this.devices.add(device);
    }

    public boolean isEmpty()
    {
        if(this.patient == null)
        {
            return true;
        }
        return false;
    }

    public void addPatientToBed(Patient patient)
    {
        if(this.isEmpty())
        {
            this.patient = patient;
        }
    }
}
