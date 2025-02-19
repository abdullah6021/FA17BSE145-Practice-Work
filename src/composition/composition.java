package composition;
class Bank
{
    private String name;

    // bank name
    Bank(String name)
    {
        this.name = name;
    }

    public String getBankName()
    {
        return this.name;
    }
}
class Employee
{
    private String name;

    // employee name
    Employee(String name)
    {
        this.name = name;
    }

    public String getEmployeeName()
    {
        return this.name;
    }
}




public class composition {
    public static void main(String[] args) {
        Bank bank = new Bank("Haris");
        Employee emp = new Employee("Sara");

        System.out.println(emp.getEmployeeName() +
                " is employee of " + bank.getBankName());
    }
}

