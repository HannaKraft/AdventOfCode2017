import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Day5
{

	public static void main(String args[])
	{
		int steps = 0;
		File file = new File(args[0]);
		Scanner scanner = null;
		ArrayList<Integer> ints = new ArrayList<Integer>();
		try
		{
			scanner = new Scanner(file);
			while(scanner.hasNext())
			{	String next = scanner.nextLine();
				ints.add(Integer.parseInt(next));
				//System.out.println(next);
			}
		}
	catch(FileNotFoundException ex)
	{

	}
	int pointer = 0;
	int currVal = 0;	
	while(pointer < ints.size()){	
		currVal = ints.get(pointer);
		if(currVal >= 3)
		{
			ints.set(pointer, currVal-1);	
		}
		else
		{
			ints.set(pointer, currVal+1);
		}
		pointer += currVal;
		steps++;

		
		}
		System.out.println(steps);
	}



}