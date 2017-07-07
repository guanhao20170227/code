package com.sunline.java.base.io;

import java.io.FileInputStream;
import java.io.IOException;



/**
 * 
 * @author GuanHao
 * @since  2017-7-4
 * @description  输入流测试，将一个文件的内容输出来
 */
public class InputStreamTest {
	
	public static void main(String[] args) throws IOException {
		
		FileInputStream fileInput = new FileInputStream("C:/Users/GuanHao/Desktop/code/java_base/write2.txt");
		
		int n = 512;
		byte[] buffer = new byte[n];
		
		// 将 字节流 fileInput 的 0 到 n 读到  buffer 中去
		while(fileInput.read(buffer,0,n) != -1 && ( n > 0)){
			System.out.println(new String(buffer));
		}
		System.out.println();
		fileInput.close();
	}
}
