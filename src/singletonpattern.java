class Singleton
{

    private static Singleton single_instance = null;


    public String name;


    private Singleton()
    {
        name = "Hello World";
    }


    public static Singleton getInstance()
    {
        if (single_instance == null)
            single_instance = new Singleton();

        return single_instance;
    }
}
public class singletonpattern {
    public static void main(String[] args)
    {

        Singleton x = Singleton.getInstance();

        Singleton y = Singleton.getInstance();


        Singleton z = Singleton.getInstance();

        // changing variable of instance x
        x.name = (x.name).toUpperCase();

        System.out.println("String from x is " + x.name);
        System.out.println("String from y is " + y.name);
        System.out.println("String from z is " + z.name);
        System.out.println("\n");

        // changing variable of instance z
        z.name = (z.name).toLowerCase();

        System.out.println("String from x is " + x.name);
        System.out.println("String from y is " + y.name);
        System.out.println("String from z is " + z.name);
    }
}
