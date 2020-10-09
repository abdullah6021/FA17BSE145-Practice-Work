package association;
class Teacher
{
    private String name;
    Teacher(String name)
    {
        this.name = name;
    }
    public String getTeacherName()
    {
        return this.name;
    }
}
class Student
{
    private String name;
    Student(String name)
    {
        this.name = name;
    }
    public String getStudentName()
    {
        return this.name;
    }
}


public class association {
    public static void main(String[] args) {
        Teacher teacherObj = new Teacher("Ali sir");
        Student studentObj = new Student("Usama");
        System.out.println(studentObj.getStudentName() +
                " is Student of " + teacherObj.getTeacherName());
    }
}
