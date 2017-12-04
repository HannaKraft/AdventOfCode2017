import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Day4

{
	public static void main(String args[]) 
	{
		int sum = 0;
		Boolean notValid = false;
		File file = new File(args[0]);
		Scanner scanner = null;
		try
		{
			scanner = new Scanner(file);
			while(scanner.hasNext())
			{
				
				
				String line = scanner.nextLine();
				String[] list = line.split("\\s");
		
			
				if(valid(list) == false && nanagram(list) == false)
				{
					sum++;
				}
				
				System.out.println(sum);
				
			}

		}

		catch(FileNotFoundException ex)
		{
			
		}

	}
	public static Boolean valid(String[] list)
	{
		Boolean notValid = false;
		
			for(int i = 0; i < list.length; i++)
			{


				System.out.println(list[i]);
				for(int j = i+1; j < list.length; j++)
					
				{
					System.out.println(list[j]);
					if(list[i].equals(list[j]))
					{
						notValid = true;

					}

				}

			}
		
		return notValid;

	}

	public static Boolean nanagram(String[] list)
	{
		Boolean anagram = false;
		for(int i = 0; i < list.length; i++)
		{
			for(int j = i+1; j < list.length; j++)
			{
				
				if(list[i] == reverse(list[j]))
				{
					anagram = true;
				}
			}
		}
		return anagram;
	}
	public static String reverse(String s)
	{
		String reversedString = "";
		for(int i=s.length(); i>0; i--)
		{
			reversedString += s.charAt(i-1);
		}

		return reversedString;
	}

	


}



	









