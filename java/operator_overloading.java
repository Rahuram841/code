import java.util.Scanner;
class ComplexNumber {
        int real,image;
        public  ComplexNumber(int r , int i)
        {
            this.real=r;
            this.image=i;
        }
        void add(int a, int b)
    {
        int sum=a+b;
        System.out.println(sum);


    }
    void add(ComplexNumber a ,ComplexNumber b)
    {
        ComplexNumber res=new ComplexNumber(0,0);
        res.real=a.real+b.real;
        res.image=a.image+b.image;
        System.out.println(res.real+"+i"+res.image);

    }
}
 class OO{
     
    
     
    public static void main(String arg[])
    {
  
        
        ComplexNumber a = new ComplexNumber(4, 5);
        ComplexNumber b = new ComplexNumber(10, 5);
        ComplexNumber ans=new ComplexNumber(0,0);
        int c1=5;
        int c2=10;
        ans.add(c1,c2);
        ans.add(a,b);
        
    }
     }
