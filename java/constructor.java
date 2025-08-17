public class constructor {
    constructor()
    {
        System.out.println("Default Constructor");
    }
    constructor(int x,int y)
    {
        System.out.println("Parametarized Constructor");
    }

}
class Main{
    public static void main(String[] args) {
        constructor con= new constructor();
        constructor con1= new constructor(10,20);
    }
}
