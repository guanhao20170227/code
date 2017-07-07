package com.sunline.java.base.mail;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

/**
 * 
 * @author GuanHao
 * @since  2017-7-7
 * @description 测试邮件的发送
 */
public class SendMail {
	public static void main(String[] args) {
		try{
			String userName="xghzhongguo@163.com";
			String password="Guanhao159357520";
			String smtp_server="smtp.163.com";
			
			String from_mail_address=userName;
			String to_mail_address="xghzhongguo@163.com";
			Authenticator auth=new PopupAuthenticator(userName,password);
			Properties mailProps=new Properties();
			mailProps.put("mail.smtp.host", smtp_server);
			mailProps.put("mail.smtp.auth", "true");
			mailProps.put("username", userName);
			mailProps.put("password", password);
	
			Session mailSession=Session.getDefaultInstance(mailProps, auth);
			mailSession.setDebug(true);
			MimeMessage message=new MimeMessage(mailSession);
			message.setFrom(new InternetAddress(from_mail_address));
			message.setRecipient(Message.RecipientType.TO, new InternetAddress(to_mail_address));
			message.setSubject("Mail Testw");
	
			MimeMultipart multi=new MimeMultipart();
			BodyPart textBodyPart=new MimeBodyPart();
			textBodyPart.setText("电子邮件测试内容www");
			//textBodyPart.setFileName("37af4739a11fc9d6b311c712.jpg");
	
			multi.addBodyPart(textBodyPart);
			message.setContent(multi);
			message.saveChanges();
			Transport.send(message);
		}catch(Exception ex){
			System.err.println("邮件发送失败的原因是："+ex.getMessage());
			System.err.println("具体的错误原因");
			ex.printStackTrace(System.err);
		}
	}
}