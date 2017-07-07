package com.sunline.java.base.io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * 
 * @author GuanHao
 * @since  2017-7-4
 * @description  输出流测试，将 一串信息，输出到一个文件中去
 */
public class OutputStreamTest {
	
	public static void main(String[] args) throws IOException {
		//## test1 start 
		// ######  直接这样 会出现 中文 乱码 的问题 ， 为解决中文乱码问题 ，需要引入 ：outputstreamwriter 这个类
		
		/*System.out.println("请输入数据：");
		int count ,n =512;
		byte[] buffer = new byte[n];
		count = System.in.read(buffer);
		
		File file = new File("C:/Users/GuanHao/Desktop/code/java_base/write.txt");
		if(file.exists()){
			file.delete();
			file.createNewFile();
		}
		FileOutputStream fout = new FileOutputStream(file);
			
		fout.write(buffer,0,count);
		
		fout.close();*/
		
		// ## test1 end 
		
		
		//test 2 解决 中文乱码 问题：用到了 OutputStreamWriter 字符流输出 
		
		File file  = new File("C:/Users/GuanHao/Desktop/code/java_base/write2.txt");
		if(file.exists()){
			file.delete();
			file.createNewFile();
		}
		FileOutputStream fout = new FileOutputStream(file);
		OutputStreamWriter outsw = new OutputStreamWriter(fout,"UTF-8");//设置编码
		outsw.append("大家好");
		outsw.append("\r\n");
		outsw.append("初次见面，请多多关照！");
		
		outsw.close();
		fout.close();
		
	}
	
	
	
	

}
