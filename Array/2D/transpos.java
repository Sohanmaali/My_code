import java.util.Scanner;
class Transpos
{
	public static void main(String[]args)                                  
	{
		Scanner sc = new Scanner(System.in);
		int a[][]= new int[20][20]; 
		
		System.out.println("Enter the dimension of ");
		int n = sc.nextInt();
		
		System.out.println("Enter size of Colom");
		int m = sc.nextInt();
			
		System.out.println("Enter Element of row & colom : ");
		
		for(int i=0; i<n; i++)
		{
			for(int j = 0; j<m; j++)
			{
				a[i][j] = sc.nextInt();
			}
		}		
		System.out.println("Actual Matrix element are");
		for(int i=0;i<n;i++)
		{
			for(int j = 0; j<m; j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		int r;
		if(n>m)
		{
			r=n;
		}
		else
		{
			r=m;
		}
		for(int i=0; i<n; i++)
		{
			for(int j = i; j<r; j++)
			{
				int temp = a[i][j];
				a[i][j] = a[j][i];
				a[j][i]= temp;
			}
		}
		
		System.out.println("Transpos of Matrix");
		for(int i=0;i<m;i++)
		{
			for(int j = 0; j<n; j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}