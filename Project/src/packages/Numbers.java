package packages;

import java.util.Scanner;

public class Numbers {
	private static Scanner s1;

	public static void main(String[] args) {
		System.out.print("Enter the number of rows: ");
		s1 = new Scanner(System.in);
		int row=s1.nextInt();
		int num=1;
		for(int i=1; i<=row;i++) 
		{
			for(int j=1;j<=i;j++) 
			{
				System.out.print(num);
				System.out.print(" ");
				num++;
			}
			System.out.println();
		}
	}

}
