public class Student
{
    //prop
    private int id;
    private String firstName;
    private String lastName;
    private int age;
    private int yearLevel;
    private static int studentCount;
    //con
    public Student(String fN , String lN , int a , int yL)
    {
        firstName = fN;
        lastName = lN;
        age = a;
        yearLevel = yL;
        id = studentCount++;
    }
    //beh
    public int getId ()
    {
        return id;
    }
    public void setId (int i)
    {
        id = i;
    }
    public String getFirstName ()
    {
        return firstName;
    }
    public void setFirstName(String fN)
    {
        firstName = fN;
    }
    public String getLastName ()
    {
        return lastName;
    }
    public void setLastName(String lN)
    {
        lastName = lN;
    }
    public int getAge ()
    {
        return age;
    }
    public void setAge (int a)
    {
        age = a;
    }
    public int getYearLevel ()
    {
        return yearLevel;
    }
    public void setYearLevel (int yL)
    {
        yearLevel = yL;
    }
    public int getStudentCount ()
    {
        return studentCount;
    }
    public boolean equals (Student s)
    {
        return s.getId() == id && s.getAge() == age && s.getFirstName().equals(firstName) && s.getLastName().equals(lastName) && s.getYearLevel() == yearLevel;
    }
    public String toString()
    {
        return "Student{id=" + id + ", firstName='" + firstName + "', lastName='"+lastName+"', age="+ age +"}";
    }
}
