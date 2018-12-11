package org.abc.kafka;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;

import com.google.common.io.Resources;

public class KafkaMsgProducer
{
	private String topic;
	KafkaProducer<String, String> producer;

	public KafkaMsgProducer()
	{
		Properties properties;
		try
		{
			InputStream is = Resources.getResource("kafka_producer.props").openStream();
//			InputStream is = new BufferedInputStream(new FileInputStream("kafka_producer.props"));
			properties = new Properties();
			properties.load(is);
			producer = new KafkaProducer<>(properties);
		}catch (FileNotFoundException e)
		{
			e.printStackTrace();
		} catch (IOException e)
		{
			e.printStackTrace();
		}
	}

	public void sendMessage(String topic, String message)
	{
		try
		{
			producer.send(new ProducerRecord<String, String>(topic,message));
			producer.flush();
		} 
		catch (Throwable throwable)
		{
			System.out.printf("%s", throwable.getStackTrace());
		} 
	}

}
