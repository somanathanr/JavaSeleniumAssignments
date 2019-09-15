package packages;

import java.util.Scanner;

public class Pyramid {
	private static Scanner s;

	public static void main(String[] args) 
	{
		System.out.print("Enter the value: ");
		s = new Scanner(System.in);
		int num=s.nextInt();
		for(int i=1; i<=num;i++)
		{
			for(int j=num;j>=i;j--)
			{
				System.out.print("  ");
			}
			for(int k=1; k<=(2*i)-1;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
