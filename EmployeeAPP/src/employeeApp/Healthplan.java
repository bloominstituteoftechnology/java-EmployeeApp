package employeeApp;;

public class Healthplan
{
    private static int maxId = 0;
    private int id;
    private String name;

    public Healthplan(String name)
    {
        maxId++;
        id = maxId;
        this.name = name;
    }

    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }
}
