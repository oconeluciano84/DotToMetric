package test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class testJson {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		String path_input="";
		String path_output="";
		File config = new File("config_path.dat");
		if(args.length == 2){
			path_input = args[0];
			path_output = args[1];
			setConfig(path_input, path_output);
		}else if(config.exists()){
			Scanner read= new Scanner(config);
			path_input=read.nextLine().split("-->")[1];
			path_output=read.nextLine().split("-->")[1];
			read.close();
		}else{
			System.out.println("INSERIRE IL PATH DELLA CARTELLA DI INPUT: ");
			Scanner read =new Scanner(System.in);
			path_input=read.nextLine();
			System.out.println("INSERIRE IL PATH DELLA CARTELLA DI OUTPUT: ");
			path_output=read.nextLine();
			read.close();
			setConfig(path_input, path_output);
		}
		
		System.out.println(path_input);
		System.out.println(path_output);

		
	}

	public static void setConfig(String in, String out) throws FileNotFoundException{
		File config = new File("config_path.dat");
		PrintStream stream_config= new PrintStream(config);
		stream_config.println("PATH_INPUT-->"+in);
		stream_config.println("PATH_OUTPUT-->"+out);
		stream_config.close();
	}
}
