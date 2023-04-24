import java.util.ArrayList;
public class ClassSection
{
    //prop
    private String subject;
    private int capacity;
    private int yearLevel;
    private ArrayList <Student> students = new ArrayList<>();
    //con
    public ClassSection (String s , int c , int yL)
    {
        subject = s;
        capacity = c;
        yearLevel = yL;
    }
    //beh
    public String getSubject ()
    {
        return subject;
    }
    public void setSubject (String s)
    {
        subject = s;
    }
    public int getCapacity ()
    {
        return capacity;
    }
    public void setCapacity(int c)
    {
        capacity = c;
    }
    public int getYearLevel ()
    {
        return yearLevel;
    }
    public void setYearLevel(int yL)
    {
        yearLevel = yL;
    }
    public ArrayList <Student> getStudents ()
    {
        return students;
    }
    public void addStudent (Student s)
    {
        if(s.getYearLevel() == yearLevel && !(isStudentEnrolled(s)))
            students.add(s);
    }
    public void removeStudent (Student s)
    {
        students.remove(s);
    }
    public boolean isStudentEnrolled (Student s)
    {
        for(int i = 0 ; i < students.size() ; i ++)
        {
            if (s.equals(students.get(i)))
            {
                return true;
            }
        }
        return false;
    }
    public String toString()
    {
        return "ClassSection{subject='" + subject + "', capacity=" + capacity + ", students="+students.toString()+"}";
    }
}
