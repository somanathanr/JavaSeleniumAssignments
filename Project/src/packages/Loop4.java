package packages;

import java.util.Scanner;

public class Loop4 {
	public static void main(String[] args) {
		System.out.print("Enter the number of rows: ");
		Scanner s = new Scanner(System.in);
		int num=s.nextInt();
		for(int i=1; i<=num; i++)
		{
			for(int j=num-1; j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
