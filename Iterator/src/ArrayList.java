public class ArrayList
{
	private Object [] array;
	private final int INITIAL_SIZE = 5;
	private int currentSize = 0;
	private int customSize;
	
	public ArrayList()
	{
		this.array = new Object[this.INITIAL_SIZE];
		currentSize = INITIAL_SIZE;
	}
	
	public ArrayList(int customSize)
	{
		this.array = new Object [customSize];
		this.customSize = customSize;
	}
	
	public void add(Object element)
	{	
		if(currentSize == customSize)
			doubleArrayLength();
		this.array[currentSize] = element;
		currentSize++;
	}
	
	public Object get(int index)
	{
		if(index < 0 || index >= this.customSize)
		{
			System.out.println("index out of bounds");
			return null;
		}	
		
		else
			return this.array[index];
	}
	
	private void doubleArrayLength()
	{
		customSize = customSize * 2;
		
		Object [] newArray = new Object[customSize];
		
		for(int i = 0; i< this.array.length; i++)
		{
			newArray[i] = array[i];
		}
		
		this.array = newArray;
		newArray = null;
	}
	
	
}
