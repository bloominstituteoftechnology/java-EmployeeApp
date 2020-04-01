package employeeApp;

/**
 * The purpose of the application is to demonstrate Java's Object Oriented and Strongly Typed Properties.
 * The application is meant as an introduction to Java for programmers familiar with other programming languages,
 * but not necessarily Object Oriented ones.
 */
public class Main
{

    /**
     * This the method where all the work is done for this application
     */
    private static void workWithData ()
    {
        /*
         * Enter the following manually
         * We are creating an object called h1 that is of type Healthplan.
         * We are sending the Healthplan constructor the Healthplan name to be used in creating the initial state of the object.
         */
        Healthplan h1 = new Healthplan("My Health 1");

        /*
         * The following is the data used by this application.
         * This section should just be copied and pasted
         */
        Healthplan h2 = new Healthplan("My Health 2");

        Company c1 = new Company("Company A", 100);

        Employee emp1 = new Employee("Steve", "Green", 45000, true, c1.id, h1.getId());
        Employee emp2 = new Employee("May", "Ford", 80000, true, c1.id, h2.getId());

        Company c2 = new Company("Company B", 100);

        Employee emp3 = new Employee("Doug", "Jones", 75000, true, c2.id, h2.getId());
        Employee emp4 = new Employee("John", "Jones", 80000, false, c2.id, h1.getId());
        /*
         * This is the end of the section you should give the students.
         */

        /* Enter the following manually
         * We are creating an object called emp5 that is of type Employee
         * We are sending the Employee class constructor data to be used to create the initial state of the object
         * fname = My
         * lname = Name
         * salary = 45000
         * has401K = true
         * company id will be the company id of company 2 automatically generated when we instantiated object c2
         * healthplan id will be the health plan id of health plan 2 automatically generated when we instantiated object h2
         */
        Employee emp5 = new Employee("My", "Name", 45000, true, c2.id, h2.getId());

        // start with practice here
        // First practice round - getting use to displaying to console
        System.out.println("*** Query Data");

        System.out.println(c1);
        System.out.println();
        System.out.println("Original: " + c1.debt);
        c1.debt = -c1.debt;
        System.out.println("Negative: " + c1.debt);
        System.out.println();
        c1.debt = -c1.debt;

        // second practice round - experimenting with date types.
        // note the \n does a blank line
        System.out.println("\n*** Working with Number ***");
        System.out.println("Original divided 5 " + (c1.debt / 5));
        System.out.println("Original mod 2     " + (c1.debt % 2));
        System.out.println("Original divided 7 " + (c1.debt / 7));
        System.out.println("Original divided 7 " + (c1.debt / 7.0));
        System.out.println("Original divided 7 " + ((double)c1.debt / 7));
        System.out.println();
        System.out.println("*** Printing Numbers and Characters ***");
        String myStr = "100";
        System.out.println("Debt: " + myStr + c1.debt);
        System.out.println("Debt: " + Integer.parseInt(myStr) + c1.debt);


        // third practice round - printing an object
        System.out.println("\n*** Printing Objects ***");
        System.out.println(c1.toString());

        System.out.println(emp1.toString());
        System.out.println();

        System.out.println(emp5.toString());
        System.out.println();

        // working with calculations
        System.out.println("*** Emp1 gets a raise");
        emp1.setSalary(emp1.getSalary() + (emp1.getSalary() * 0.03));
        System.out.println(emp1.toString());
        System.out.println();

        System.out.println("*** 401K amount for emp5");
        System.out.println(emp5.getSalary() * c1.match401K);
        System.out.println();


        // fourth practice round - working with string functions
        // https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html
        System.out.println("*** Company Names ***");
        System.out.println("Combined");
        System.out.println(c1.name + " " + c2.name);
        System.out.println("No Vowels");
        String noVowels = c1.name.toLowerCase().replaceAll("[aeiou]", "_");
        System.out.println(noVowels);
        System.out.println();

        String nameStr = emp1.getName();
        System.out.println(nameStr);
        for (int i = 0; i < nameStr.length(); i++)
        {
            System.out.print(nameStr.charAt(i) + " ");
        }
        System.out.println();
    }


    /**
     * This is the main method, the starting point for this application. Normally the main methods in a Java application
     * are small. Java programs prefer to have the majority of work done is other methods with the main method simply
     * calling those other methods.
     *
     * @param args Not used in the program. However if arguments were going to come into the program via the command line
     *             this is where they would be stored.
     */
    public static void main(String[] args)
    {
        // Let's call a method to do most of the work
        workWithData();
    }
}
