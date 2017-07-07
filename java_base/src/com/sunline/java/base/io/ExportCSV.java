package com.sunline.java.base.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author GuanHao
 * @since  2017-7-4
 * @description  导出  csv 文件，
 */
public class ExportCSV {
	
	public static void main(String[] args) {
		List<String> dataList = new ArrayList<String>();
		dataList.add("1,张三,男");
        dataList.add("2,李四,男");
        dataList.add("3,小红,女");
        File file = new File("C:/Users/GuanHao/Desktop/code/java_base/excel/export.csv");
        Boolean isSuccess = exportCsv(file,dataList);
        System.out.println(isSuccess);
		
	}
	
	//导出 类
	public static boolean exportCsv(File file,List<String> dataList){
		
		boolean isSuccess = false;
		
		FileOutputStream out = null ; //字节输出流
		OutputStreamWriter osw = null;//字符输出流
		BufferedWriter bw = null ;//字符输出流
		
		try {
			out = new FileOutputStream(file);
			osw = new OutputStreamWriter(out,"GBK");
			bw = new BufferedWriter(osw);
			
			if(dataList != null && !dataList.isEmpty()){
				for(String data:dataList){
					bw.append(data).append("\r");
				}
			}
			isSuccess = true;
		} catch (FileNotFoundException e) {
			isSuccess = false;
			e.printStackTrace();
		} catch (IOException e) {
			isSuccess = false;
			e.printStackTrace();
		}
		finally{
			if(bw!=null){
                try {
                    bw.close();
                    bw=null;
                } catch (IOException e) {
                    e.printStackTrace();
                } 
            }
            if(osw!=null){
                try {
                    osw.close();
                    osw=null;
                } catch (IOException e) {
                    e.printStackTrace();
                } 
            }
            if(out!=null){
                try {
                    out.close();
                    out=null;
                } catch (IOException e) {
                    e.printStackTrace();
                } 
            }
        }
		return isSuccess;
	}
	
}
