
import java.util.Scanner;
public class Clumps 
{
public static void main(String[] args)
{
	
	int clumps=0;
	Scanner sc = new Scanner(System.in);
	
	int a[]=new int[10];
	System.out.println("Enter elements of Array:");
	
	for(int i=0;i<10;i++)
	{
		a[i]=sc.nextInt();
	}
	for(int i=0;i<10;i++)
	{
		int j=i+1;
		if(a[i]==a[j])
		{
			clumps++;
			while((a[i]==a[j]))
				{
				if(j==9)
					break;
				j++;
				
				}
		}
		i=j-1;
		if(i==8)
			break;
		
		
	}
	
	System.out.println("The number of clumps are "+clumps);
}
}
