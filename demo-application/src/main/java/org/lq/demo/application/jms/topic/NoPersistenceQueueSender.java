package org.lq.demo.application.jms.topic;

import javax.jms.Connection;
import javax.jms.Destination;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.activemq.ActiveMQConnectionFactory;

public class NoPersistenceQueueSender {
	
	
	public static void main(String[] args) throws Exception {
		
		ActiveMQConnectionFactory activeMQConnectionFactory = new ActiveMQConnectionFactory("tcp://192.168.229.10:61616");
		
		Connection connection = activeMQConnectionFactory.createConnection();
		connection.start();
		
		Session session = connection.createSession(Boolean.TRUE, Session.AUTO_ACKNOWLEDGE);
		
		Destination destination=session.createTopic("mytopic");
		MessageProducer producer = session.createProducer(destination);
		
		 int i=0;
		 while(i<3){
			 TextMessage message = session.createTextMessage("msg***"+i);
			 System.out.println("非持久订阅消息生产发送消息为:"+message.getText());

			 producer.send(message);
			 i++;
		 }
		 session.commit();
		 session.close();
		 connection.close();
		
		
		
	}

}
