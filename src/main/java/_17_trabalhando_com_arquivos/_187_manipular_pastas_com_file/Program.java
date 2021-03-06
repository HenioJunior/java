package _17_trabalhando_com_arquivos._187_manipular_pastas_com_file;

import java.io.File;
import java.util.Scanner;

public class Program {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a folder path: ");
		String strPath = sc.nextLine();//O usuario digitou o caminho
		
		File path = new File(strPath);//Instanciando o new File recebendo path
		
		File[] folders = path.listFiles(File::isDirectory);//Pegar todas as pastas que estao apartir deste caminho
		System.out.println("FOLDERS: ");
		for (File folder : folders)// Para cada folder na lista folders;
		{
			System.out.println(folder);
		}
		File[] files = path.listFiles(File::isFile);
		System.out.println("FILES: ");
		for (File file : files)
		{
			System.out.println(file);
		}
		//Criando subpasta a partir de temp;
		boolean success = new File(strPath + "/subdir2").mkdir();
		System.out.println("Directory created successfully: " + success);

		sc.close();
	}
}
