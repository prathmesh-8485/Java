class Demo42
{
    private int a;
    private int b;

    Demo42(int a, int b)
    {
        this.a=a;
        this.b=b;
    }
    public int getA()
    {
        return a;
    }
    public void setA(int a)
    {
        this.a=a;
        System.out.println("value update successfully ");
    }
    public int getB()
    {
        return b;
    }
    public void setB(int b)
    {
        this.b=b;
        System.out.println("value update successfully ");
    }
}

class Demo 
{
    public static void main (String []args)
    {
        Demo42 ab=new Demo42(10,20);

        System.out.println("A -"+(ab.getA()));
        ab.setA(100);
        System.out.println("A -"+(ab.getA()));
        System.out.println("B -"+(ab.getB()));
        ab.setB(200);
        System.out.println("B -"+ab.getB());
    }
}