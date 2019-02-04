package employeeApp;;

public class Employee
{
    private static int maxId = 0;
    private int id;
    private String fname;
    private String lname;
    private double salary;
    private Boolean has401K;
    private int companyID;
    private int healthPlanID;

    public Employee(String fname, String lname, double salary, Boolean has401K, int companyID, int healthPlanID)
    {
        maxId++;
        id = maxId;

        this.fname = fname;
        this.lname = lname;
        this.salary = salary;
        this.has401K = has401K;
        this.companyID = companyID;
        this.healthPlanID = healthPlanID;
    }

    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return fname + " " + lname;
    }

    public void setFname(String fname)
    {
        this.fname = fname;
    }

    public void setLname(String lname)
    {
        this.lname = lname;
    }

    public double getSalary()
    {
        return salary;
    }

    public void setSalary(double salary)
    {
        this.salary = salary;
    }

    public Boolean getHas401K()
    {
        return has401K;
    }

    public void setHas401K(Boolean has401K)
    {
        this.has401K = has401K;
    }

    public int getCompanyID()
    {
        return companyID;
    }

    public void setCompanyID(int companyID)
    {
        this.companyID = companyID;
    }

    public int getHealthPlanID()
    {
        return healthPlanID;
    }

    public void setHealthPlanID(int healthPlanID)
    {
        this.healthPlanID = healthPlanID;
    }

    @Override
    public String toString()
    {
        String rtnStr = "id: " + id + "\n" +
                        "fname: " + fname + "\n" +
                        "lname: " + lname + "\n" +
                        "salary: " + salary + "\n" +
                        "has401K: " + has401K + "\n" +
                        "companyID: " + companyID  + "\n" +
                        "healthPlanID: " + healthPlanID + "\n";
        return rtnStr;
    }
}
