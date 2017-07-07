package com.sunline.java.base;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BRReaderLine {
	
	public static void main(String[] args) throws IOException {
		
		// 使用 system.in 创建 BufferReader
		/*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		System.out.println("Enter lines of text.");
		System.out.println("Enter 'end' to quit.");
		do {
		       str = br.readLine();
		       System.out.println(str);
		} while(!str.equals("end"));*/
		
		
		int b;
		b ='A';
		System.out.write(b);
		System.out.println('\n');
		System.out.println(b);
		System.out.println('\n');
	}
}
