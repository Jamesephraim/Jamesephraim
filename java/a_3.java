class Student
{
    String name;
    int no;
    void setDetails(int num)
    {
        name= "Legend";
        no=num;
    }
    void display(){
        System.out.println(STR."Name : \{name}\tRoll No : \{no}");
    }
}
class a_3{
    public static void main(String args[])
    {
        Student stu=new Student();
        stu.setDetails(1);
        stu.display();
    }
}