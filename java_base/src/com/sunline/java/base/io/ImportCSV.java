package com.sunline.java.base.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author GuanHao
 * @since  2017-7-4
 * @description  导出  csv 文件，InputStreamReader 可以解决乱码 的问题
 */
public class ImportCSV {
	
	public static void main(String[] args) {
	
		File file = new File("C:/Users/GuanHao/Desktop/code/java_base/excel/export.csv");
		List<String> dataList = importCsv(file);
		if(dataList != null && !dataList.isEmpty()){
			for(String data : dataList){
				System.out.println(data);
			}
		}
		
	}
	
	// 导入类
	public static List<String> importCsv(File file){
		
		List<String> dataList = new ArrayList<String>();
		
		FileInputStream fileInput = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		try {
			fileInput = new FileInputStream(file);
			isr = new InputStreamReader(fileInput,"GBK");
			br = new BufferedReader(isr);
			String line = "";
			
			while((line = br.readLine()) != null){
				dataList.add(line);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			if(br!=null){
                try {
                    br.close();
                    br=null;
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
		}
		return dataList;
	}
	
}
