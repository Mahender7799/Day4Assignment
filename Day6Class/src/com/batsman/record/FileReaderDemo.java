package com.batsman.record;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderDemo {

	public static void main(String[] args) throws FileNotFoundException,IOException {
		String sfile= args[0];
		String dfile= args[1];
		FileReader fin = new FileReader(sfile);  
		FileWriter fout = new FileWriter(dfile, true);  
		int c;  
		while ((c = fin.read()) != -1) {  
		 fout.write(c);  
		}  
		System.out.println("Copy finish...");  
		fin.close();  
		fout.close();
	}

}