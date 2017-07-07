package com.sunline.java.base.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReaderAndWriterTest {
	
	public static void main(String[] args) throws IOException {
		// Reader Start 
		
		FileReader fr = new FileReader("config/txt/abcd.txt");
		BufferedReader br = new BufferedReader(fr);
		//System.out.println(br.readLine());
		
		//Reader end 
		
		
		//Write start
		FileWriter fw = new FileWriter("config/txt/abcd_bak.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		String line = null;
		//System.out.println(br.readLine());
		//System.out.println(br.readLine());
		while((line = br.readLine()) != null){
			bw.write(line);
			bw.newLine();
		}
		bw.flush(); //清空
		
		
		fr.close();
		fw.close();
		//write end 
	}

}
