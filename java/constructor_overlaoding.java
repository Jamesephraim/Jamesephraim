import static java.lang.System.*;

class student
{
    String name="Unknown";
    int RollNo=0;
    student(){
        out.println("Default constructor");
    }
    student(String n){
         name=n;
        System.out.println("Name :"+name);
        System.out.println("NO :"+RollNo);

    }
    student(String n,int rollNo) {
        name = n;
        RollNo = rollNo;
        System.out.println("Name :"+name);

        System.out.println("NO :"+RollNo);

    }


}

 class constructor_overlaoding {
     public static void main(String[] args) {
         student s=new student();
         student s1 = new student("James");
         student s2 = new student("Syam",333);

     }


}
