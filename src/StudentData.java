public class StudentData
{
    private String studName;
    private int studID;
    private int studAge;

    StudentData()
    {
        this.studAge = 21;
        this.studID = 123;
        this.studName = "TEST STUDENT";
    }

    StudentData(int age, int rollNum, String name)
    {
        this.studAge = age;
        this.studName = name;
        this.studID = rollNum;
    }
    public static void main(String args[])
    {
        //This object creation would call the default constructor
        StudentData myobj = new StudentData();
        System.out.println("Student Name is: "+myobj.studName);
        System.out.println("Student Age is: "+myobj.studAge);
        System.out.println("Student ID is: "+myobj.studID);

        /*This object creation would call the parameterized
         * constructor StudentData(int, String, int)*/
        StudentData myobj2 = new StudentData(555, 111, "DDD");
        System.out.println("Student Name is: "+myobj2.studName);
        System.out.println("Student Age is: "+myobj2.studAge);
        System.out.println("Student ID is: "+myobj2.studID);
    }
}