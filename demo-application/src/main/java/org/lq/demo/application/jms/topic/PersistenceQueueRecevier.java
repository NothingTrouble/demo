package org.lq.demo.application.jms.topic;

import javax.jms.Connection;
import javax.jms.Message;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.jms.Topic;
import javax.jms.TopicSubscriber;

import org.apache.activemq.ActiveMQConnectionFactory;

public class PersistenceQueueRecevier {
	
	
	public static void main(String[] args) throws Exception {
		
		ActiveMQConnectionFactory activeMQConnectionFactory = new ActiveMQConnectionFactory("tcp://192.168.229.10:61616");
		
		Connection connection = activeMQConnectionFactory.createConnection();
		connection.setClientID("lq001");
		
		Session session = connection.createSession(Boolean.TRUE,Session.AUTO_ACKNOWLEDGE);
		
		Topic destination = session.createTopic("mytopic01");
		TopicSubscriber topicSubscriber = session.createDurableSubscriber(destination,"dfdf");
		
		connection.start();
		Message message =topicSubscriber.receive();
		while(null !=message){
			TextMessage text =(TextMessage) message;
			System.out.println("持久订阅消息消费:"+text.getText());
			
			message=topicSubscriber.receive(1000l);
		}
		 session.commit();
		 session.close();
		 connection.close();
		
		
	}

}
