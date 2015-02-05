public class Student
{
	private String name;
	private double gpa;
	private int idNumber;
	
	public Student(String name, double gpa, int idNumber)
	{
		this.name = name;
		this.gpa = gpa;
		this.idNumber = idNumber;
	}
	
	public String toString()
	{
		String str = "";
		
		str+= "The Student name is: " + this.name + "\n";
		str+= "GPA: " + this.gpa + "\n";
		str+= "Id Number: " + this.idNumber + "\n";
		
		return str;
	}
}
