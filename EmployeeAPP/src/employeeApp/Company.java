package employeeApp;

/**
 * A class to represent the company where the employee works
 */
public class Company
{
    /**
     * Keeps track of the last assigned company id number (int)
     */

    private static int maxId = 0;
    /**
     * match401K is a class field that is shared by all objects. So all companies have the same 401K matching amount
     * The field is accessed publicly so no getters or setters are needed
     */
    public final static double match401K = 0.05;

    /**
     * The company id number (int) of the current company
     * The field is accessed publicly so no getters or setters are needed
     */
    public int id;

    /**
     * The name of the company (String) of the current company
     * The field is accessed publicly so no getters or setters are needed
     */
    public String name;

    /**
     * The current debt (int) of the current company
     * The field is accessed publicly so no getters or setters are needed
     */
    public int debt;

    /**
     * Constructor for a new company.
     * id is automatically generated in the constructor
     *
     * @param name The name (String) of the new company
     * @param debt The debt (int) of the new company
     */
    public Company(String name, int debt)
    {
        /**
         * maxId is a class field that is shared by all objects
         */
        maxId++;
        id = maxId;
        this.name = name;
        this.debt = debt;
    }
}
