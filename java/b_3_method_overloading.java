import static java.lang.System.*;

public class b_3_method_overloading {
    private void add(int x)
    {
        System.out.println("x= "+(x));
    }
    private void add(int x ,int y)
    {
        System.out.println("x+y= "+(x+y));
    }
    private void add(int x ,int y,int z)
    {
        System.out.println("x+y+z= "+(x+y+z));
    }
    private void add(int x ,int y,double z)
    {
        System.out.println("x+y+zf= "+(x+y+z));
    }

    public static void main(String[] args) {
        b_3_method_overloading obj= new b_3_method_overloading();
        obj.add(10);
        obj.add(10,20);
        obj.add(10,20,30);
        obj.add(10,20,30.2);
    }



}
