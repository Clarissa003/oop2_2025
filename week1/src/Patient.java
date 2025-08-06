import java.time.LocalDate;
import java.time.Period;

public class Patient
{
    private String name;
    private LocalDate dateOfBirth;
    private char sex;
    private boolean canWalk;
    private int heartrate;
    private Bloodpressure bloodpressure;

    public Patient(String name, LocalDate dateOfBirth, char sex)
    {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.sex = sex;
        this.canWalk = true;
        this.heartrate = 0;
        this.bloodpressure = null;
    }

    public String getName()
    {
        return this.name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public LocalDate getDateOfBirth()
    {
        return this.dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth)
    {
        this.dateOfBirth = dateOfBirth;
    }

    public char getSex()
    {
        return this.sex;
    }

    public void setSex(char sex)
    {
        this.sex = sex;
    }

    public boolean isCanWalk()
    {
        return this.canWalk;
    }

    public void setCanWalk(boolean canWalk)
    {
        this.canWalk = canWalk;
    }

    public int getHeartrate()
    {
        return this.heartrate;
    }

    public void setHeartrate(int heartrate)
    {
        this.heartrate = heartrate;
    }

    public Bloodpressure getBloodpressure()
    {
        return this.bloodpressure;
    }

    public void setBloodpressure(Bloodpressure bloodpressure)
    {
        this.bloodpressure = bloodpressure;
    }

}
