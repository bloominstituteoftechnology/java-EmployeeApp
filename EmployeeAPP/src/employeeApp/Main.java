package employeeApp;;

/*
- Create Company
- Create Employee
- Create Healthplan
- instantiate objects
 */

public class Main
{

    private static void workWithData ()
    {
        Healthplan h1 = new Healthplan("My Health 1");
        Healthplan h2 = new Healthplan("My Health 2");

        Company c1 = new Company("Company A", 100);

        Employee emp1 = new Employee("Steve", "Green", 45000, Boolean.TRUE, c1.id, h1.getId());
        Employee emp2 = new Employee("May", "Ford", 80000, Boolean.TRUE, c1.id, h2.getId());

        Company c2 = new Company("Company B", 100);

        Employee emp3 = new Employee("Doug", "Jones", 75000, Boolean.TRUE, c2.id, h2.getId());
        Employee emp4 = new Employee("John", "Jones", 80000, Boolean.FALSE, c2.id, h1.getId());
        Employee emp5 = new Employee("My", "Name", 45000, Boolean.TRUE, c2.id, h2.getId());


    // start with practice here
    // First practice round
        System.out.println("*** Query Data");

        System.out.println(c1);
        System.out.println();
        System.out.println("Original: " + c1.debt);
        c1.debt = -c1.debt;
        System.out.println("Negative: " + c1.debt);
        System.out.println();
        c1.debt = -c1.debt;

    // second practice round
        System.out.println("Original divided 5 " + (c1.debt / 5));
        System.out.println("Original mod 2     " + (c1.debt % 2));
        System.out.println("Original divided 7 " + (c1.debt / 7));
        System.out.println("Original divided 7 " + (c1.debt / 7.0));
        System.out.println("Original divided 7 " + ((double)c1.debt / 7));
        System.out.println();
        String myStr = "100";
        System.out.println("Debt: " + myStr + c1.debt);
        System.out.println("Debt: " + Integer.parseInt(myStr) + c1.debt);


    // third practice round
        System.out.println(emp1.toString());
        System.out.println();

        System.out.println(emp5.toString());
        System.out.println();


        System.out.println("*** Emp1 gets a raise");
        emp1.setSalary(emp1.getSalary() + (emp1.getSalary() * 0.03));
        System.out.println(emp1.toString());
        System.out.println();


        System.out.println("*** 401K amount for emp5");
        System.out.println(emp5.getSalary() * c1.match401K);
        System.out.println();


    // fourth practice round
        // https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html
        System.out.println("*** Company Names");
        System.out.println("Combined");
        System.out.println(c1.name + " " + c2.name);
        System.out.println("No Vowels");
        String noVowels = c1.name.toLowerCase().replaceAll("[a,e,i,o.u]", "_");
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


    public static void main(String[] args)
    {
        workWithData();

        // System.out.println(h1);
    }
}
