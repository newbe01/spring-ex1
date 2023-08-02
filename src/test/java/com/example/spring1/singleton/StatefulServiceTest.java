package com.example.spring1.singleton;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

import static org.assertj.core.api.Assertions.assertThat;

class StatefulServiceTest {

    @Test
    void statefulServiceSingleton() {

        ApplicationContext ac = new AnnotationConfigApplicationContext(TestConfig.class);
        StatefulService statefulService1 = ac.getBean(StatefulService.class);
        StatefulService statefulService2 = ac.getBean(StatefulService.class);

//        statefulService1.order("userA", 1000);
//        statefulService2.order("userB", 2000);
//
//        int price = statefulService1.getPrice();
//        System.out.println("price = " + price);

//        assertThat(statefulService1.getPrice()).isNotEqualTo(1000);

        int userA = statefulService1.order("userA", 1000);
        int userB = statefulService2.order("userB", 2000);

        System.out.println("userA = " + userA);

        assertThat(userA).isEqualTo(1000);


    }

    static class TestConfig {

        @Bean
        public StatefulService statefulService() {
            return new StatefulService();
        }

    }
}