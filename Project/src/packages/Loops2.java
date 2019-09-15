package packages;
import java.util.Scanner;

public class Loops2 {
	public static void main(String[] args) 
	{
		System.out.print("Enter the number of rows * to be printed: ");
		Scanner s= new Scanner(System.in);
		int num = s.nextInt();
		for(int i=1; i<=num; i++)
		{
			for(int j=1; j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
