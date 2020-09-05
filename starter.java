import pkg.*;
import java.util.Arrays;

public class starter /*implements InputControl, InputKeyControl*/
{
		// Nilesh Gupta Period 2 HW

		public static void main(String args[])
		{
			PlayerList NBA = new PlayerList("players.txt","positions.txt","scores.txt");
			
			NBA.sortPlayerList();
			System.out.println(NBA.toString());
		}
}

