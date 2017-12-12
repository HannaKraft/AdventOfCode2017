import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Day6
{
	public static void main (String args[])
	{
		File file = new File(args[0]);
		Scanner scanner = null;
		int pointer = 0;
		int runs = 0;
		int max = 0;

		try
		{
			scanner = new Scanner(file);
			while(scanner.hasNext())
			{
				String line = scanner.nextLine();
				String[] list = line.split("\t");
				int[] ints = new int[list.length];
				ArrayList<String> lists = new ArrayList<String>();

				for (int i = 0; i < list.length; i++)
					{

						ints[i] = Integer.parseInt(list[i]);

					}
			lists.add(Arrays.toString(ints));
			while(cont(lists) == true)
				{	

					while(pointer < ints.length)
					{
						if(ints[pointer] >= max)
						{
							max = ints[pointer];
							System.out.println(max);
						}
						pointer++;
					}
					lists.add(Arrays.toString(ints));
					int add = max%16;
					int add2 = max-(add);
					for(int i = 0; i<ints.length;i++)
					{
						ints[i] = add2 + add;
						System.out.println(ints[i]);
					}
				}
			}
		
	
		}
		catch(FileNotFoundException ex)
		{

		}

	}
	public static Boolean cont(ArrayList<String> list)
	{
		Boolean c = true;
		
			for(int i = 0; i < list.size(); i++)
			{


				//System.out.println(list[i]);
				for(int j = i+1; j < list.size(); j++)
					
				{
					if((list.get(i)).equals(list.get(j)))
					{
						c = false;
						System.out.println(c);
					}
					///System.out.println(list[j]);

					

				}

			}
		
		return c;

	}


	
	
	//public static Boolean continue (int[] ints)
	//{
	//	int c = true;
	//	return c;
	//}
	
}