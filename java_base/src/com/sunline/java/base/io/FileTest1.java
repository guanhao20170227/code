package com.sunline.java.base.io;

import java.io.File;
import java.io.IOException;

/**
 * 
 * @author GuanHao
 * @since  2017-7-4
 * @description io 类库 File 的 测试
 */
public class FileTest1 {
	
	public static void main(String[] args) throws IOException {
		File f = new File("C:/Users/GuanHao/Desktop/code/java_base/12345.txt");
		//创建新的文件
		
		f.createNewFile();
		//删除文件，
		f.delete();
		File f2 = new File("C:/Users/GuanHao/Desktop/code/java_base/123456789.txt");
		// 修改文件名
		f.renameTo(f2);
	}
	

}
