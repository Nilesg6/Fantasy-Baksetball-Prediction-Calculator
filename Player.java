import pkg.*;
import java.util.Arrays;
import java.util.ArrayList;


public class Player
{
	private String name;
	private String position;
	private double score;

	public Player(String n, String p, double s)
	{
		name = n;
		position = p;
		score = s;
		
		if(position.length() == 1)
		{
			position = position + " ";
		}
	}
	
	public String getName()
	{
		return name;
	}	
		
	public String getPosition()
	{
		return position;
	}	
	
	public double getScore()
	{
		return score;
	}	
	
	private String spacer(String n)
	{
		String spaces = "";
		int l = 27 - n.length();
		
		for(int i = 0; i < l; i++)
		{
			spaces = spaces + " ";
		}	
		
		return spaces;
	}
	
	public String toString()
	{
		return "Name: " + name + spacer(name+position) + "Position: " + position + "    Score: " + score;
	}
}

