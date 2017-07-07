package com.sunline.java.base.network;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * 
 * @author GuanHao
 * @since  2017-7-7
 * @description Socket 编程的 客服端
 */
public class GreetingClient {
	
	public static void main(String[] args) {
		try {
			//创建 socket 对象
			Socket socket = new Socket("localhost",8989);
			
			//根据输入输出流和服务端连接
			OutputStream outputStream = socket.getOutputStream();//获取一个输出流，向服务器输出信息
			PrintWriter printWriter = new PrintWriter(outputStream);//将输出流包装成打印流
			printWriter.print("服务端你好， 我是 小兔");
			printWriter.flush();
			socket.shutdownOutput();//关闭输出流
			
			InputStream inputStream = socket.getInputStream();//获取一个输入流，接受服务端信息
			InputStreamReader inputStreamReader = new InputStreamReader(inputStream,"utf-8");//包装成字符流，提高效率
			BufferedReader bufferedReader = new BufferedReader(inputStreamReader); //加到缓存区
			String info = "";
			String temp = null;
			while((temp = bufferedReader.readLine()) != null){
				info += temp;
				System.out.println("客服端接受服务端发送的信息：" + info);
			}
			
			//关闭对应的资源
			bufferedReader.close();
			inputStream.close();
			printWriter.close();
			outputStream.close();
			socket.close();
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
