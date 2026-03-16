public class StudentInfo{
    
    public void studentName()
    {
        System.out.println("Name : Pradeep Kumar");
    }

    public void studentList()
    {
        System.out.println("List : 50");
    }

    public void studentMark()
    {
        System.out.println("Marks : 1005");
    }

    public void studentaddress()
    {
        System.out.println("Address : Indore");
    }

    public static void main(String [] args)
    {
        StudentInfo Info = new StudentInfo();

        Info.studentName();
        Info.studentList();
        Info.studentMark();
        Info.studentaddress();
    }
}