public class constructor_overloading {
    constructor_overloading(int x)
    {
        System.out.println("x= "+(x));
    }
    constructor_overloading(int x,int y)
    {
        System.out.println("x+y= "+(x+y));
    }
    constructor_overloading(int x,int y,double z)
    {
        System.out.println("x+y+z= "+(x+y+z));
    }
    constructor_overloading(String name,int no)
    {
        System.out.println("Name = "+name+"  Number :"+ no);
    }

    public static void main(String[] args) {
        constructor_overloading c1=new constructor_overloading(10);
        constructor_overloading c2=new constructor_overloading(10,20);
        constructor_overloading c3=new constructor_overloading(10,20,30.20);
        constructor_overloading c4=new constructor_overloading("JAMES",1);
    }

}
