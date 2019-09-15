package packages;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling3 
{
	public static void main(String[] args) throws IOException
	{
		File f1=new File("D:\\Test\\TextContent.txt");
		FileReader fr= new FileReader(f1);
		BufferedReader br = new BufferedReader(fr);
		File f2=new File("D:\\Test\\TextContent2.txt");
		FileWriter fw= new FileWriter(f2);
		BufferedWriter bw= new BufferedWriter(fw);
		String text="";
		while((text=br.readLine())!=null)
		{
			bw.write(text);
			bw.newLine();
			System.out.println(text);
		}
		bw.close();
	}		
}
