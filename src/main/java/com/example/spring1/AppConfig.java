package com.example.spring1;

import com.example.spring1.discount.DiscountPolicy;
import com.example.spring1.discount.FixDiscountPolicy;
import com.example.spring1.discount.RateDiscountPolicy;
import com.example.spring1.member.MemberRepository;
import com.example.spring1.member.MemberService;
import com.example.spring1.member.MemberServiceImpl;
import com.example.spring1.member.MemoryMemberRepository;
import com.example.spring1.order.OrderService;
import com.example.spring1.order.OrderServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public MemberService memberService() {
        System.out.println("call AppConfig.memberService");
        return new MemberServiceImpl(memberRepository());
    }

    @Bean
    public OrderService orderService() {
        System.out.println("call AppConfig.orderService");
        return new OrderServiceImpl(memberRepository(), discountPolicy());
//        return null;
    }

    @Bean
    public MemberRepository memberRepository() {
        System.out.println("call AppConfig.memberRepository");
        return new MemoryMemberRepository();
    }

    @Bean
    public DiscountPolicy discountPolicy() {
//        return new FixDiscountPolicy();
        return new RateDiscountPolicy();
    }

}
