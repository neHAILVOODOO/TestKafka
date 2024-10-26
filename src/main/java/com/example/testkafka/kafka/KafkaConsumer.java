package com.example.testkafka.kafka;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaConsumer.class);


    @KafkaListener(topics = "ttest", groupId = "myGroup")
    public void consume(String message) {
        LOGGER.info(String.format("Message received -> %s", message));
    }

}
//  .\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties - запустить зукипер

//   .\bin\windows\kafka-server-start.bat .\config\server.properties - запустить кафку

//  .\bin\windows\kafka-topics.bat --list --bootstrap-server localhost:9092 - просмотреть все топики

//  .\bin\windows\kafka-console-consumer.bat --topic ttest --from-beginning --bootstrap-server localhost:9092 -- посмотреть все соо в топике
