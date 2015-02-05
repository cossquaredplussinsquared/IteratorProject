import java.util.Iterator;
import java.util.ArrayList;

public class CourseIterator implements Iterator
{
	
	private ArrayList<Student> roster;
	private int cur = 0;
	
	public CourseIterator(ArrayList<Student> roster)
	{
		this.roster = roster;
	}
	
	@Override
	public boolean hasNext()
	{
		if(cur >= roster.size())
			return false;
		else
			return true;
	}

	@Override
	public Object next()
	{
		Student student = roster.get(cur);
		cur++;
		return student;
	}

	@Override
	public void remove()
	{
		
		
	}	
	
	
	
}
