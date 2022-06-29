
public class inheritance{
    
    
    public static void main(String args[]){
        Programmer p=new Programmer();
        System.out.println("Programmmer salary is:"+p.salary);
        System.out.println("Bonus of Programmer is:"+p.bonus);
    }
}
class Employee{
        float salary=4000;
    }
class Programmer extends Employee{
        int bonus=1000;
    }
