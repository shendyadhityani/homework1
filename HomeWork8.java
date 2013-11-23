public class HomeWork8
{
	public static void main (String[] args)
	{
		String[] arrayBulan1d = new String[]{"jan", "feb", "Maret", "April", "Mei", "Juni", "July", "Agust", "Sept", "Okt", "Nov", "Des"};
		String[][] arrayBulan2d = new String[3][4];
		int accumulator =0;
		for (int i=0; i<3 ; i++)
		{
			for (int j=0; j<4; j++)
			{
				arrayBulan2d[i][j] = arrayBulan1d[accumulator]; 
				System.out.print(arrayBulan2d[i][j]+ " ");
				accumulator++;
			}

			System.out.println();
		}
	}

}
