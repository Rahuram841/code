class Max2{
    float a=5;
    float b=10;
    float c=6;
    void avg(float a, float b)
    {
        float avg=(a+b)/2;
        System.out.println(avg);
    }
    void avg(float a, float b, float c)
    {
        float avg=(a+b+c)/3;
        System.out.println(avg);
    }
}
class Max3 extends Max2{
    float c=15;
    void  avg(float a, float b)
    {
        int avg=(int)(a+b)/2;
         System.out.println(avg);
    }
    void avg(float a, float b, float c)
    {
        int avg=(int)(a+b+c)/3;
         System.out.println(avg);
    }
}
class ctp{
    public static void main(String[]args)
    {
          Max2 m1=new Max2();
          m1.avg(m1.a,m1.b);
          m1.avg(m1.a,m1.b,m1.c);
          Max3 m2=new Max3();
          m2.avg(m2.a,m2.b);
          m2.avg(m2.a,m2.b,m2.c);

    }

}