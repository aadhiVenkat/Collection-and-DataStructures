package DynamicArray;


public class Array 
{
	private int items[];
	private int count;
	Array(int size)
	{
		items=new int[size];		
	}
	public void insert(int item)
	{
		if(items.length==count)
		{
			int[] newitems=new int[count*2];
			for(int i=0;i<count;i++)
				newitems[i]=items[i];
			items=newitems;
		}	
			items[count++]=item;
	}
	public void print()
	{
		for(int i=0;i<count;i++)
			System.out.println(items[i]);
	}
	public void removeAt(int index)
	{
		if(index<0 || index>=count)
			throw new IllegalArgumentException();
		else
		{
			for(int i=index;i<count;i++)
				items[i]=items[i+1];
			count--;
		}
	}
	public int indexOf(int index)
	{
		if(index>count)
			return -1;
		
		return items[index];
	}
}

