package packages;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling2 
{
	private BufferedReader br;
	private static Scanner s;
	private static Scanner e;
	public void ReadFile(int f, int l) throws IOException
	{
		File f1=new File("D:\\Test\\TextContent.txt");
		FileReader fr= new FileReader(f1);
		br = new BufferedReader(fr);
		String text="";
		for(int i=1;i<=l;i++)
		{
			text=br.readLine();
			if(i>=f)
			{
				System.out.println(text);
			}
		}
	}	
	public static void main(String[] args) throws IOException{
		FileHandling2 fh = new FileHandling2();
		System.out.print("Enter the Starting number: ");
		s = new Scanner(System.in);
		int st=s.nextInt();
		System.out.print("Enter the Starting number: ");
		e = new Scanner(System.in);
		int end=e.nextInt();
		fh.ReadFile(st, end);
	}
}
