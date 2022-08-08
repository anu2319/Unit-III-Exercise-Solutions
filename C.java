class C
{
    protected int m;
    protected int n;

    public C(int mIn, int nIn)
    {
        m = mIn;
        n = nIn;
    }

    public int m1()
    {
        return m + n;
    }
}

class B extends C
{

    public B(int mIn, int nIn) {
        super(mIn, nIn);
    }

    public int m1()
    {
        return m-n;
    }
}

class Main
{
    public static void main(String[] args)
    {
        C c = new C(5,4);
        System.out.println("Addition of two numbers are : " + c.m1());
        C c1 = new B(5,4);
        System.out.println("Subtraction of two numbers are : " + c1.m1());
    }
}



