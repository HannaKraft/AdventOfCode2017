import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Day2

{
	public static void main(String args[]) 
	{
		int sum = 0;
		File file = new File(args[0]);
		Scanner scanner = null;
		try
		{
			scanner = new Scanner(file);
			while(scanner.hasNext())
			{
				
			
				String line = scanner.nextLine();
				String[] list = line.split("\t");
				int[] intlist = new int[list.length];

				for (int i = 0; i < list.length; i++)
					{

						intlist[i] = Integer.parseInt(list[i]);

					}
				Arrays.sort(intlist);
				for (int i = 0; i < list.length; i++)
				{

					for(int j = i+1; j < list.length; j++)
						if(intlist[j]%intlist[i] == 0)
						{
							Arrays.sort(intlist);
							sum+= intlist[j]/intlist[i];
							System.out.print(intlist[j]/intlist[i]+" ");
							System.out.print(i+" ");
							System.out.println(j);
						}
				}
			Arrays.sort(intlist);
				for(int i = 0; i < list.length; i++) {
					//System.out.print(intlist[i]+" ");

				}

				//For part 1
				//System.out.println(" ");
				//sum += intlist[intlist.length - 1] - intlist[0]; 

				System.out.println(sum);

			}

		}

		catch(FileNotFoundException ex)
		{
			
		}
		
	}

}

	









