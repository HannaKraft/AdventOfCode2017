
import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Day7 {



public static void main (String args[])
	{
		File file = new File(args[0]);
		Scanner scanner = null;
		HashMap<String, String[]> map = new HashMap<String,String[]>();
		try
		{

			scanner = new Scanner(file);
			while(scanner.hasNext())
			{
				String line = scanner.nextLine();
				String[] list = line.split("\\s");
				String name = list[0]; 
				String weight = list[1];
				
				String allfunc = "";
				
				if(list.length > 1 )
				{
					for(int i = 3; i < list.length; i++)
					{
						allfunc = allfunc + list[i]; 
					}
					//System.out.println(allfunc);
					
				}
				String[] children = allfunc.split(",");
				map.put(name, children);


				
			}
			//System.out.println(map.size());
			for(String i : map.keySet())
				{
					map = harakiri(map, i);
				}
			//System.out.println(map.keySet());



		}
		catch(FileNotFoundException ex)
		{

		}


	}

	public static HashMap<String, String[]> harakiri (HashMap<String, String[]> map, String key)

	{

		if(map.containsKey(key))
		{
			String[] values = map.get(key);
			if(!(values[0].equals("")) )
			{
				for(int i = 0; i<values.length; i++)
				{
					map = harakiri(map, values[i]);
					String s = values[i];
					map.remove(s);
				}

			}

		}

		return map;

	}


}