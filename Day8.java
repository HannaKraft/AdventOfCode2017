import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Collections;
import java.util.Collection;
import java.util.Set;

public class Day8{
	
	public static void main (String args[])
	{
		File file = new File(args[0]);
		Scanner scanner = null;

		HashMap<String, Integer> map = new HashMap<String,Integer>();
		try
		{
			int max = 0;
			scanner = new Scanner(file);
			while(scanner.hasNext())
			{		
				String line  = scanner.nextLine();
				String[] list = line.split("\\s");
				
				int add = Integer.parseInt(list[2]);	
				if(list[1].equals("dec"))
					add *= -1;

				if(map.get(list[0]) != null)
					add += map.get(list[0]);

				int cmptr2 = Integer.parseInt(list[6]);

				int cmptr1 = 0;
				if (map.get(list[4]) != null)
					cmptr1 = map.get(list[4]);


//////////////////////////////////////////////// Cases
				if(list[5].equals("==") && cmptr1 == cmptr2)
					map.put(list[0], add);
				else if (list[5].equals("<") && cmptr1 < cmptr2) 
					map.put(list[0], add);
				else if (list[5].equals(">") && cmptr1 > cmptr2)
					map.put(list[0], add);
				else if (list[5].equals(">=") && cmptr1 >= cmptr2) 
					map.put(list[0], add);
				else if (list[5].equals("<=") && cmptr1 <= cmptr2) 
					map.put(list[0], add);		
				else if (list[5].equals("!=") && cmptr1 != cmptr2) 
					map.put(list[0], add);		

				if(map.get(list[0]) != null && map.get(list[0]) > max)
					max = map.get(list[0]);

			}
			Collection<Integer> values = map.values();
			System.out.println("Max1 = " + Collections.max(values));
			System.out.println("Max2 = " + max);
		}
		catch(FileNotFoundException ex){}
	}
}