
import java.util.Scanner;
public class Clump
{
public static void main(String[] args)
{
	
	int clumps=0;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter length of Array:");
	int n= sc.nextInt();
	int a[]=new int[10];
	System.out.println("Enter elements of Array:");
	
	for(int i=0;i<n;i++)
	{
		a[i]=sc.nextInt();
	}
	for(int i=0;i<n;i++)
	{
		int j=i+1;
		if(a[i]==a[j])
		{
			clumps++;
			while((a[i]==a[j]))
				{
				if(j==--n)
					break;
				j++;
				
				}
		}
		i=j-1;
		if(i==--n)
			break;
		
		
	}
	
	System.out.println("The number of clumps are "+clumps);
}
}