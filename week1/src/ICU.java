import java.util.ArrayList;

public class ICU
{
    private ArrayList<Bed> beds;
    private String location;
    private double numberFTEs;

    public ICU(ArrayList<Bed> beds, String location, double numberFTEs)
    {
        this.beds = beds;
        this.location = location;
        this.numberFTEs = numberFTEs;
    }

    public ArrayList<Bed> getBeds()
    {
        return this.beds;
    }

    public void setBeds(ArrayList<Bed> beds)
    {
        this.beds = beds;
    }

    public String getLocation()
    {
        return this.location;
    }

    public void setLocation(String location)
    {
        this.location = location;
    }

    public double getNumberFTEs()
    {
        return this.numberFTEs;
    }

    public void setNumberFTEs(double numberFTEs)
    {
        this.numberFTEs = numberFTEs;
    }

    public void addBed(Bed bed)
    {
        this.beds.add(bed);
    }
}
