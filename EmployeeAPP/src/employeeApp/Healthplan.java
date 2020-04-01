package employeeApp;

/**
 * A class to represent the health plan choices for employees
 */
public class Healthplan
{
    /**
     * Keeps track of the last assigned health plan id number (int)
     */
    private static int maxId = 0;

    /**
     * The health plan id number (int) of the current health plan
     */
    private int id;

    /**
     * The name (String) of current health plan
     */
    private String name;

    /**
     * Constructor for a new health plan.
     * id is automatically generated in the constructor
     *
     * @param name The name (String) of the new health plan
     */
    public Healthplan(String name)
    {
        /**
         * maxId is a class field that is shared by all objects
         */
        maxId++;
        id = maxId;
        this.name = name;
    }

    /**
     * Getter for the health plan id of this object
     *
     * @return The health plan id (int) of this object
     */
    public int getId()
    {
        return id;
    }

    /**
     * Getter for the name of this health plan
     *
     * @return The name (String) of this health plan
     */
    public String getName()
    {
        return name;
    }
}
