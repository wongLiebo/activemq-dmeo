package com.example.activemq.queue;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import javax.jms.JMSException;
import javax.jms.TextMessage;

@Component
public class QueueConsumer {


    @JmsListener(destination = "${myqueue}")
    public void  receive(TextMessage textMessage) throws JMSException {
        System.out.println("消费者接收到消息："+textMessage.getText());
    }


}
