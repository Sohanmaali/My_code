import java.util.Scanner;
class Array
{
  public  static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Dimension of matric");
		int n=sc.nextInt();
		int m=sc.nextInt();
		System.out.println("Enter the element");
		int a[][] = new int[3][3];
		int i,j;
		for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
			{
		       a[i][j]=sc.nextInt();		 
			}
		}
		for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
			{
				System.out.print("\t"+a[i][j]); 		 
			}
			System.out.println();
		}
	}
}