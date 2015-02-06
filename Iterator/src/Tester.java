

public class Tester
{

	public static void main(String[] args)
	{
		
		Course course = new Course("Programming Principles I", 210);
		
		course.addStudent("Amanda Rose Grogan", 4.0, 12345);
		course.addStudent("Micheal Dolan Peterson", 2.2, 10101);
		course.addStudent("Samir Paul Ouahhabi", 3.5, 67890);
		course.addStudent("Alex Dupree", 3.5, 67890);
		course.addStudent("Christain Elliot Dupree", 3.5, 67890);
		
		System.out.println(course);
		
		printRoster(course);
	}
	
	public static void printRoster(Course course)
	{
		for(Student s : course)
		{
			System.out.println(s);
		}
	}


}
