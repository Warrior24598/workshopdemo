public class Prime 
{
	public static void main(String[] args)
	{
		System.out.println("Prime Numbers 1 to 1000: ");
		int c=0;
		for(int i=2;i<=1000;i++)
		{
			c=0;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					c++;
					break;
				}
			}
			if(c==0)
			{
				System.out.println(i);
			}
		}
	}

}