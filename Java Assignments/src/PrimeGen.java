
public class PrimeGen {

	public static void main(String[] args) {
		
		
		int i=0;
		int num=0;
		System.out.println(" The Prime Numbers between 1 and 100 are :");
		
		for(i=1;i<=100;i++)
		{
			int count=0;
			
			for(num=i;num>=1;num--)
			{
					if(i%num==0)
					{
						count=count+1;
					}
			}
			
			if(count==2)
			{
				
				System.out.print(" ");
				System.out.print(i);
			}
		}
			

	}

}
	