public class HomeWork5
{
	public static void main (String[] args)
	{
		int x = 77;
		int y = 78;
		int z = 91;
		int resultPencarian = cariNilaiTerkecil(x,y,z);

		System.out.println("Nilai Minimum dari f(99,77,88) adalah" + resultPencarian);
	}

	public static int cariNilaiTerkecil(int x, int y, int z)
	{
		int resultNilaiTerkecil;
		if (x < y && x < z)
			resultNilaiTerkecil = x;
		else if (y < z && y < x) 
			resultNilaiTerkecil = y;
		else 
			resultNilaiTerkecil = z;
		return resultNilaiTerkecil;
	}
}
