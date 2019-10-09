package org.lq.demo.application.jms;

import javax.jms.Connection;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageConsumer;
import javax.jms.MessageListener;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.websocket.OnMessage;

import org.apache.activemq.ActiveMQConnectionFactory;


public class QueueRecevier2 {
	
	
	public static void main(String[] args) throws Exception {
		Connection connection=null;
		Session session =null;
		try {
			ActiveMQConnectionFactory activeMQConnectionFactory = new ActiveMQConnectionFactory();
			activeMQConnectionFactory.setBrokerURL("failover:(tcp://192.168.229.10:61616,tcp://192.168.229.10:61617)");
			
			connection = activeMQConnectionFactory.createConnection();
			connection.start();
			
			session = connection.createSession(Boolean.TRUE, Session.AUTO_ACKNOWLEDGE);
			
			Destination destination = session.createQueue("20190910235959");
			
			MessageConsumer createConsumer = session.createConsumer(destination);
			System.out.println("消息消费开始。。。");
			
			int i=0;
			while(i<10){
				TextMessage message =(TextMessage) createConsumer.receive();
				session.commit();

				System.out.println("消费消息为"+message.getText());
				i++;
			}
			
			
		}catch (Exception e) {
			System.out.println("e:"+e.getMessage());
		}finally{
			session.close();
			connection.close();
			System.out.println("消息消费结束。。。");
		}
		

		

		
		
	}
}
