package com.sunline.java.base.io;

import java.io.File;
import java.io.IOException;

/**
 * 
 * @author GuanHao
 * @since  2017-7-4
 * @description io ��� File �� ����
 */
public class FileTest1 {
	
	public static void main(String[] args) throws IOException {
		File f = new File("C:/Users/GuanHao/Desktop/code/java_base/12345.txt");
		//�����µ��ļ�
		
		f.createNewFile();
		//ɾ���ļ���
		f.delete();
		File f2 = new File("C:/Users/GuanHao/Desktop/code/java_base/123456789.txt");
		// �޸��ļ���
		f.renameTo(f2);
	}
	

}
