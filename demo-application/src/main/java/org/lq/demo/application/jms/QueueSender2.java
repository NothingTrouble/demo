package org.lq.demo.application.jms;

import javax.jms.Connection;
import javax.jms.Destination;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.activemq.ActiveMQConnectionFactory;

public class QueueSender2 {
	
	
	public static void main(String[] args) throws Exception {
		
		 ActiveMQConnectionFactory activeMQConnectionFactory = new ActiveMQConnectionFactory();
		 activeMQConnectionFactory.setBrokerURL("failover:(tcp://192.168.229.10:61616,tcp://192.168.229.10:61617)&randomize=true");
		 
		 Connection connection = activeMQConnectionFactory.createConnection();
		 connection.start();
		 
		 Session session = connection.createSession(Boolean.TRUE, Session.AUTO_ACKNOWLEDGE);
		 
		 Destination destination= session.createQueue("20190910235959");
		 MessageProducer producer = session.createProducer(destination);
		 System.out.println("消息发送开始。。。");

		 int i=0;
		 while(i<10){
			 TextMessage message = session.createTextMessage("msg***"+i);
			 System.out.println("发送消息为:"+message.getText());

			 producer.send(message);
			 i++;
		 }
		 session.commit();
		 session.close();
		 connection.close();
		 
		 System.out.println("消息发送结束。。。");
		 System.out.println("消息发送结束。。。");
		 System.out.println("消息发送结束fatete1。。。");
	
		
	}

}
