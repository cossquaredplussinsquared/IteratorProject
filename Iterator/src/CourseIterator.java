import java.util.Iterator;
import java.util.ArrayList;

public class CourseIterator<Type> implements Iterator<Type>
{
	
	private Type[] roster;
	private int cur = 0, size = 0;
	
	
	public CourseIterator(Type[] roster2, int rosterSize)
	{
		this.roster = roster2;
		size = rosterSize;
	}
	

	@Override
	public boolean hasNext()
	{
		if(cur >= size)
			return false;
		else
			return true;
	}

	@Override
	public Type next()
	{
		Type student = roster[cur];
		cur++;
		return student;
	}

	@Override
	public void remove()
	{
		
		
	}	
	
	
	
}
