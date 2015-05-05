
public class NumPatern
{
	
	
	public static void main(String args [] )
	{

		int check=0;
		int count=2;
		int i=0;
		int r=0;
		int j=0;
		while(count>0)
		{
			if(check==0)
			{
				
				for(i=1;i<=5;i++)
				{
					for(j=1;j<=i;j++)
					{
						System.out.print(j);
				
					}
					System.out.println();
				}
				check++;
			}
			
			else
			{
				for(i=1,r=5-1;i<=5-1;i++,r--)
				{
					for(j=1;j<=r;j++)
					{
						System.out.print(j);
						
					}
					
					System.out.println();
				}
			}
		
			count--;
		}
	}
}