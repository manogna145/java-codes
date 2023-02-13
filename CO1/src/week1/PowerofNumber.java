package week1;
class PowerofNumber
{
	 
    static boolean isPower(int n)
    {
        for (int x = 2; x <= Math.sqrt(n); x++) {
            int y = 2;
 
            double p = Math.pow(x, y);
 
            while (p <= n && p > 0) 
      {
         if (p == n)
                    return true;
                y++;
                p = Math.pow(x, y);
            }
        }
        return false;
    }
 
    // Driver function
    public static void main(String[] args)
    {
        for (int i = 2; i < 100; i++)
            if (isPower(i))
                System.out.print(i + " ");
    }
}