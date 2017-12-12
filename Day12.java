
import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
public class Day12 {



public static void main (String args[])
	{
		File file = new File(args[0]);
		Scanner scanner = null;
		ArrayList<Integer> integers = new ArrayList<Integer>();
		HashMap<Integer, ArrayList<Integer>> map = new HashMap<Integer, ArrayList<Integer>>();
		try
		{
			scanner = new Scanner(file);
			while(scanner.hasNext())
			{
				String line = scanner.nextLine();
				String[] list = line.split("\\s");
		
				ArrayList<Integer> ints = new ArrayList<Integer>();
				for(int i = 0; i < list.length; i++)
				{
					list[i] = list[i].replace(",", "");

				}
					
				 for(int i = 2; i < list.length; i++)
				 {
				 	ints.add((i-2), Integer.parseInt(list[i]));

				 }
				map.put(Integer.parseInt(list[0]), ints );


			}
			integers.add(0);

			ArrayList<Integer> ints2 = new ArrayList<Integer>();
			int i = 0;
			while(integers.size() != i)
			{
				i = integers.size();
				for(int elem : integers)
				{
					if(map.get(elem) != null)
					{
						ints2.addAll(map.remove(elem));
					}
				}
				integers.addAll(ints2);
				for(int j = 0; j < integers.size(); j++){
				}
				ints2.clear();
		    }
			Set<Integer> s = new HashSet<Integer>(integers);
			System.out.println("Size = " + s.size());
			
		}
		catch(FileNotFoundException ex)
		{

		}
	}
}
