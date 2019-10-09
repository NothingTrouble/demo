package org.lq.demo.application.jms.topic;

import javax.jms.Connection;
import javax.jms.Destination;
import javax.jms.Message;
import javax.jms.MessageConsumer;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.activemq.ActiveMQConnectionFactory;

public class NoPersistenceQueueRecevier {
	
	
	public static void main(String[] args) throws Exception {
		
		ActiveMQConnectionFactory activeMQConnectionFactory = new ActiveMQConnectionFactory("tcp://192.168.229.10:61616");
		
		Connection connection = activeMQConnectionFactory.createConnection();
		connection.start();
		Session session = connection.createSession(Boolean.TRUE,Session.AUTO_ACKNOWLEDGE);
		
		Destination destination = session.createTopic("mytopic");
		MessageConsumer consumer = session.createConsumer(destination);
		
		Message message =consumer.receive();
		while(null !=message){
			TextMessage text =(TextMessage) message;
			System.out.println("非持久订阅消息消费:"+text.getText());
			
			message=consumer.receive(1000l);
		}
		 session.commit();
		 session.close();
		 connection.close();
		
		
	}

}
