
import java.util.Iterator;

public class Course implements Iterable<Student>
{
	private String courseName;
	private int courseNumber;
	private Student[] roster;
	private int rosterSize;
	
	public Course(String courseName, int courseNumber)
	{
		this.courseName = courseName;
		this.courseNumber = courseNumber;
		this.roster = new Student[10];
		this.rosterSize = 0;
	}

	@Override
	public Iterator<Student> iterator()
	{
		return new CourseIterator<Student>(roster, rosterSize);
	}
	
	public void addStudent(String name, double gpa, int idNumber)
	{
		Student student = new Student(name, gpa, idNumber);
		rosterSize++;
		if(rosterSize == roster.length)
			rosterSizeIncrease();
		else
			this.roster[rosterSize - 1] = student;
	}
	
	private void rosterSizeIncrease() {
		Student[] newRoster = new Student[roster.length * 2];
		for(int i = 0; i < roster.length; i++){
			newRoster[i] = roster[i];
		}
		roster = newRoster;
		
	}
	
	public String toString()
	{
		String str = "";
		
		str+= "The Course Name is: " + this.courseName + "\n";
		str+= "The Course Number is: " + this.courseNumber + "\n";
		
		return str;
	}
	
}
