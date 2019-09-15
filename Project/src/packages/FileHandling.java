package packages;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling 
{
	private BufferedReader br;
	public String ReadFile(int n) throws IOException
	{
		int i=1;
		File f=new File("D:\\Test\\TextContent.txt");
		FileReader fr= new FileReader(f);
		br = new BufferedReader(fr);
		String text="";
		while((text=br.readLine())!=null)
		{
			if(i==n)
			{
				break;
			}
			i++;
		}
		return text;
	}	
	public static void main(String[] args) throws IOException{
		FileHandling fh = new FileHandling();
		System.out.print("Enter the line Number: ");
		Scanner s = new Scanner(System.in);
		int lineNumber=s.nextInt();
		System.out.println(fh.ReadFile(lineNumber));
	}
}
