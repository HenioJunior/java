package _17_trabalhando_com_arquivos._185_bloco_try_with_resources;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {

	public static void main(String[] args)
	{
		String path = "/home/heniojr/workspaces/temp/in.txt";
		
		try(BufferedReader br = new BufferedReader(new FileReader(path)))
		{
			String line = br.readLine(); //leitura de uma linha do arquivo
			while(line != null)
			{
				System.out.println(line);
				line = br.readLine();
			}
		}
		catch(IOException e)
		{
		System.out.println("Error: " + e.getMessage());	
		}
	}
}

