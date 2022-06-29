class Bike{
    void run()
    {
        System.out.println("Running...");
    }
}
class splendor extends Bike{
    void run()
    {
        System.out.println("Biking...");
    }
}
class ToRun
{
    public static void main(String args[])
    {
        Bike b=new splendor();
        b.run();
        Bike c=new Bike();
        c.run();
    }
}