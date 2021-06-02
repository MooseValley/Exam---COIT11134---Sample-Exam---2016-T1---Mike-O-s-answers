public class Q01_Person
{
	private String name;
	private int age;

	public Q01_Person(String n, int a)
	{
		name = n;
		age = a;
	}

	@Override
	public String toString()
	{
		return name + " " +age;
	}

	public void setName (String name)
	{
		this.name = name;
	}

	public void setAge (int age)
	{
		this.age = age;
	}

	public String getName ()
	{
		return name;
	}

	public int getAge ()
	{
		return age;
	}

} //end class definition
