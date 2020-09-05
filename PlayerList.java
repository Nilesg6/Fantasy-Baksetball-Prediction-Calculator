import pkg.*;
import java.util.Arrays;
import java.util.ArrayList;

public class PlayerList
{
	ArrayList<Player> pList = new ArrayList<Player>();
	
	public PlayerList()
	{
		EasyReader names = new EasyReader("players.txt");
		EasyReader position = new EasyReader("position.txt");
		EasyReader scores = new EasyReader("scores.txt");
		
		while(!names.eof())
		{
			String n;
			String p;
			double s;
			
			// n = names.readLine();
			n = names.readLine();			
			
			// p = position.readLine();
			p = position.readLine();
			
			// s = scores.readDouble();
			s = scores.readDouble();
			
			// System.out.println()
			
			Player tempo = new Player(n,p,s);
      		pList.add(tempo);	
		}
	}

	public PlayerList(String alist, String blist, String clist)
	{
		EasyReader names = new EasyReader(alist);
		EasyReader position = new EasyReader(blist);
		EasyReader scores = new EasyReader(clist);
		
		while(!names.eof())
		{
			String n;
			String p;
			double s;
			
			// n = names.readLine();
			n = names.readLine();			
			
			// p = position.readLine();
			p = position.readLine();
			
			// s = scores.readDouble();
			s = scores.readDouble();
			
			Player tempo = new Player(n,p,s);
      		pList.add(tempo);	
		}
	}
	
	public ArrayList<Player> sortPlayerList()
	{ 
		bubbleSort(pList);
		return pList;
	}
	
	private static void bubbleSort(ArrayList<Player> c)
	{
		Player temp = new Player(" "," ",0.0);
		for(int i = 0; i < c.size(); i++)
		{
			for(int j = i+1; j < c.size(); j++)
			{
				if(c.get(i).getScore() > c.get(j).getScore())
				{
					temp = c.get(i);
					c.set(i,c.get(j));
					c.set(j,temp);
				}
			}
		}
	}
	
	public String toString()
	{
		String s = "";

		for(int i = pList.size()-1; i >= 0; i--)
		{		
			s = s + "\n" +  pList.get(i).toString();
		}
		
		return s;
	}
			
}