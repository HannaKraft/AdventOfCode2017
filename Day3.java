public class Day3
{
	public static void main(String args[])
	{
		int i = Integer.parseInt(args[0]);
		int start = 1;
		int corner = 1;
		int row = 0;
		int column = 0;
		int value = 1;
		while(i > (start*start))
		{
			start += 2;
			row--;
			column++;

			
		}
		corner = start*start;

		int toNextCorner = ((corner-(4 + ((start-2)*(start-2))))/4)+1;
		int secondCorner = corner - toNextCorner;
		int thirdCorner = corner - toNextCorner*2;
		int fourthCorner = corner - toNextCorner*3;
		System.out.println("To next corner = "+toNextCorner);

		if(i >= secondCorner)
		{
			for(int j = corner; j > secondCorner; j--)
			{
				if(j == i)
				{
					


				}
				else
				{
					column--;

				}

			}
		
		int steps = row + Math.abs(column);
		}
		else if(i < secondCorner && i >= thirdCorner )

		{
			column = column - toNextCorner;
			
			
			for(int k = secondCorner; k >= thirdCorner; k--)
			{
				if(k == i) 
				{
					int steps = Math.abs(row) + Math.abs(column);
					System.out.println(steps); 
					System.out.println("row = " + row + "column = " + column);


				}
				else
				{

					row++;
				}
			}

					}
		else if (i <= thirdCorner && i > fourthCorner)
		{

			row = row + toNextCorner;
			column = column - toNextCorner;
			System.out.println("row = " + row);
			System.out.println("column = " + column);
			for(int l = thirdCorner; l >= fourthCorner; l--)
			{
				if(l == i)
				{
					int steps = Math.abs(row) + Math.abs(column);
					System.out.println(steps);

				}
				else
				{
					column++;
				}
			}
		}

		else if (i <= fourthCorner && i > fourthCorner-(toNextCorner))
		{
			row = row + toNextCorner;
			for(int m = fourthCorner; m >= fourthCorner-(toNextCorner); m-- )
			{
				if (m == i)
				{
					int steps = Math.abs(row) + Math.abs(column);
					System.out.println(steps);
				}
				else
					column--;
			}
		}

		
	}


	
}
