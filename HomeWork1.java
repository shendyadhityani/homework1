public class HomeWork1
{
    public static void main (String[] args)
    {
        float[] bilPer = new float[10];
                for (int i=0; i < bilPer.length; i++)
                {
                        // bilGenap[i] = i+1;
                        // System.out.print("1/");
                        // System.out.println(bilPer[i]);
                    bilPer[i] = 1 / (float) (i + 1);
                    System.out.println(bilPer[i]);
                }   
    }
}
