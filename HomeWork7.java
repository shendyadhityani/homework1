public class HomeWork7
{
	public static void main (String[] args)
	{
		int[][] arrayGanjil = new int[4][4];
		int accumulator = 1;
		for (int i = 0; i < 4 ; i++)
		{
			for (int s = 0 ; s < 4 ; s++)
			{
				arrayGanjil[i][s] = (2*accumulator)-1;
				accumulator++;
			}
		}

		for (int i = 0 ; i < 4 ; i++)
		{
			for (int s = 0; s < 4; s++)
			{
				System.out.print(arrayGanjil[i][s]+ " ");
			}

			System.out.println();
		}
	}
}
