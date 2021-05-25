package com.example.activemq;

import com.example.activemq.queue.QueueProducer;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ActivemqSpringbootApplicationTests {

    @Autowired
    QueueProducer queueProducer;

    @Test
    void contextLoads() {
        queueProducer.prodceMsg();
    }



}
