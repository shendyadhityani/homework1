public class HomeWork6
{
	public static void main (String[] args)
	{
		int a = 10;
		cariHasilBilPrima(a);
	}

	public static void cariHasilBilPrima(int a)
	{
		for (int i = 1 ; i < a ; i++)
		{	int accumulator = 0;	
				for (int j = 1 ; j <= i ; j++)
				{
					if (i % j == 0)
					{
						accumulator++;
					}
				}
			if (accumulator == 2)
			{
			System.out.print (i);
			}
		}
	}
}
