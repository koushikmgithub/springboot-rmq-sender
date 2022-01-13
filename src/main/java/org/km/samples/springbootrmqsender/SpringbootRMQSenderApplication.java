
package org.km.samples.springbootrmqsender;

import org.springframework.amqp.core.Queue;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class SpringbootRMQSenderApplication {

    public static final String KEDAQ = "kedaQ";

    public static void main(String[] args) {
        SpringApplication.run(SpringbootRMQSenderApplication.class, args);
    }
  
    @Bean
    public Queue kedaQueue() {
        return new Queue(KEDAQ, false);
    }

    

}
