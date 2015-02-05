
import java.util.Iterator;

public class Course implements Iterable
{
	private String courseName;
	private int courseNumber;
	private ArrayList roster;
	
	public Course(String courseName, int courseNumber)
	{
		this.courseName = courseName;
		this.courseNumber = courseNumber;
		this.roster = new ArrayList();
	}

	@Override
	public Iterator iterator()
	{
		return new CourseIterator(roster);
	}
	
	public void addStudent(String name, double gpa, int idNumber)
	{
		Student student = new Student(name, gpa, idNumber);
		this.roster.add(student);
	}
	
	public ArrayList getRoster()
	{
		return this.roster;
	}
	
	public String toString()
	{
		String str = "";
		
		str+= "The Course Name is: " + this.courseName + "\n";
		str+= "The Course Number is: " + this.courseNumber + "\n";
		
		return str;
	}
	
}
