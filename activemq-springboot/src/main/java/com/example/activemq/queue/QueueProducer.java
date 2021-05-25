package com.example.activemq.queue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Component;

import javax.jms.Queue;
import java.util.Date;

@Component
public class QueueProducer {

    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;
    @Autowired
    private Queue queue;


    @SuppressWarnings("deprecation")
    public void prodceMsg(){
        jmsMessagingTemplate.convertAndSend(queue,"message发送内容:"+new Date().toLocaleString());
    }


}
