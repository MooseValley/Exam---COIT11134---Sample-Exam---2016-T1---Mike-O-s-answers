import java.util.LinkedList;
import java.util.Iterator;

public class Q06_LinkedListIterator
{
	public static void main(String[] args)
	{
		String[] team = {"Australia","New Zealand", "India","UK","Pakistan","China"};

		LinkedList<String> teamList = new LinkedList<String>();

		for (int i=0; i<team.length; i++)
		{
			teamList.add(team[i]);
		}

		for (int i=0; i<teamList.size(); i++)
		{
			String tempTeam = teamList.get(i);
			if (tempTeam.equals("New Zealand"))
			{
				teamList.remove(i);
			}
		}


		System.out.println("\nfor loop:");
		for (int j=0; j< teamList.size(); j++)
		{
			System.out.println(" - " + teamList.get(j).toString());
		}


		// Iterators are no longer covered in COIT11134 !!!!

		System.out.println("\nIterator:");
		Iterator myIter = teamList.iterator ();
		while (myIter.hasNext() == true)
		{
			System.out.println(" - " + myIter.next());
		}

	}

}//end of class definition
