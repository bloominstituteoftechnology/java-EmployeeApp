package employeeApp;

/**
 * This class represents an employee
 */
public class Employee
{
    /**
     * Keeps track of the last assigned employee id number (int)
     */
    private static int maxId = 0;

    /**
     * Is the unique employee id (int) for the employee represented by the object
     */
    private int id;

    /**
     * The first name (String) for the employee represented by the object
     */
    private String fname;

    /**
     * The last name (String) for the employee represented by the object
     */
    private String lname;

    /**
     * The salary (double) for the employee represented by the object
     */
    private double salary;

    /**
     * Answers the question, does the employee have a 401K retirement plan (boolean)
     */
    private boolean has401K;

    /**
     * The company id (int) where this employee works
     */
    private int companyId;

    /**
     * The health plan id (int) the employee has chosen
     */
    private int healthPlanId;

    /**
     * The constructor for this employee. There is no default constructor. Creates an employee object with the given initial state.
     * id is automatically assigned so is not sent as a parameter
     *
     * @param fname The first name (String) for the employee represented by the object
     * @param lname The last name (String) for the employee represented by the object
     * @param salary The salary (double) for the employee represented by the object
     * @param has401K Answers the question, does the employee have a 401K retirement plan (boolean)
     * @param companyId The company id (int) where this employee works
     * @param healthPlanId The health plan id (int) the employee has chosen
     */
    public Employee(String fname, String lname, double salary, boolean has401K, int companyId, int healthPlanId)
    {
        //maxId is a class field so its value is shared by all objects
        maxId++;
        id = maxId;

        // this represents the current object, so this.fname means the field fname in the current object
        this.fname = fname;
        this.lname = lname;
        this.salary = salary;
        this.has401K = has401K;
        this.companyId = companyId;
        this.healthPlanId = healthPlanId;
    }

    /**
     * The getter for the id of the employee
     *
     * @return the id (int) of the employee
     */
    public int getId()
    {
        return id;
    }

    /**
     * Returns the full name of the employee
     *
     * @return the employee's firstname and lastname together separated by a space (String)
     */
    public String getName()
    {
        return fname + " " + lname;
    }

    /**
     * Setter for the employee's first name
     *
     * @param fname The new first name (String) of this employee
     */
    public void setFname(String fname)
    {
        this.fname = fname;
    }

    /**
     * Setter for the employee's last name
     *
     * @param lname The new last name (String) of this employee
     */
    public void setLname(String lname)
    {
        this.lname = lname;
    }

    /**
     * Getter for the salary of this employee
     *
     * @return The current salary (double) of this employee
     */
    public double getSalary()
    {
        return salary;
    }

    /**
     * Setter for the salary of this employee
     *
     * @param salary The new salary (double) for the employee
     */
    public void setSalary(double salary)
    {
        this.salary = salary;
    }

    /**
     * Answers the question does the employee have a 401K retirement plan
     *
     * @return true of false if the employee has a 401K plan
     */
    public boolean getHas401K()
    {
        return has401K;
    }

    /**
     * Setter for the field has401K
     *
     * @param has401K the new answer to the question does the employee have a 401K plan (boolean)
     */
    public void setHas401K(boolean has401K)
    {
        this.has401K = has401K;
    }

    /**
     * Getter for company id
     *
     * @return the company id (int) where this employee works
     */
    public int getCompanyId()
    {
        return companyId;
    }

    /**
     * Setter for company id
     *
     * @param companyId the new company id (int) where this employee works
     */
    public void setCompanyId(int companyId)
    {
        this.companyId = companyId;
    }

    /**
     * Getter for healthplan id
     *
     * @return the healthplan id (int) of the health plan that this employee has chosen
     */
    public int getHealthPlanId()
    {
        return healthPlanId;
    }

    /**
     * Setter for healthplan id
     *
     * @param healthPlanId the new healthplan id (int) of the health plan that this employee has chosen
     */
    public void setHealthPlanId(int healthPlanId)
    {
        this.healthPlanId = healthPlanId;
    }

    /**
     * Overrides the standard toString method inherited from Object.
     * The standard toString method returns the pointer where this employee is located.
     *
     * @return The current state of the employee as a String
     */
    @Override
    public String toString()
    {
        String rtnStr = "id: " + id + "\n" +
            "fname: " + fname + "\n" +
            "lname: " + lname + "\n" +
            "salary: " + salary + "\n" +
            "has401K: " + has401K + "\n" +
            "companyId: " + companyId  + "\n" +
            "healthPlanId: " + healthPlanId + "\n";
        return rtnStr;
    }
}
