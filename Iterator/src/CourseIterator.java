import java.util.Iterator;
import java.util.ArrayList;

public class CourseIterator implements Iterator
{
	
	private ArrayList roster;
	private int cur = 0;
	
	public CourseIterator(Object roster2)
	{
		this.roster = (ArrayList) roster2;
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
		Student student = (Student) roster.get(cur);
		cur++;
		return student;
	}

	@Override
	public void remove()
	{
		
		
	}	
	
	
	
}
