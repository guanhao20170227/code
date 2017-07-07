package com.sunline.java.base.network;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 
 * @author GuanHao
 * @since  2017-7-7
 * @description socket 编程 服务端
 */
public class GreetingServer extends Thread {
	
	public static void main(String[] args) {
		
		try {
			ServerSocket serverSocket = new ServerSocket(8989);
			System.out.println("服务端已经启动，等待客服端连接 ...");
			Socket socket = serverSocket.accept(); //侦听并接受到此套接字的连接,返回一个Socket对象
			
			//根据输入输出流和客户端连接
			InputStream inputStream = socket.getInputStream();//得到输入流，接受客服端传递的信息
			InputStreamReader inputStreamReader = new InputStreamReader(inputStream);//提高效率，将字节流转换为字符流
			BufferedReader bufferedReader = new BufferedReader(inputStreamReader);//加入缓冲区
			
			String temp = null;
			String info = "" ;
			while((temp = bufferedReader.readLine()) != null){
				info += temp;
				System.out.println("已经接受到客服端的连接");
				System.out.println("接受到客服端的信息：" + info + ",当前客服端的 ip 为 ：" + socket.getInetAddress());
			}
			
			OutputStream outputStream = socket.getOutputStream();//获取一个输入流，像服务端发送信息
			PrintWriter printWriter = new PrintWriter(outputStream);//将输出流包装成打印流
			printWriter.print("你好，服务端已经接受到了你的信息");
			printWriter.flush(); //清空 printWriter 
			socket.shutdownOutput();
			
			// 关闭对应资源
			printWriter.close();
			outputStream.close();
			bufferedReader.close();
			inputStream.close();
			socket.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
