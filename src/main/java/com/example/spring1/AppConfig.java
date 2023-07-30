package com.example.spring1;

import com.example.spring1.discount.FixDiscountPolicy;
import com.example.spring1.member.MemberService;
import com.example.spring1.member.MemberServiceImpl;
import com.example.spring1.member.MemoryMemberRepository;
import com.example.spring1.order.OrderService;
import com.example.spring1.order.OrderServiceImpl;

public class AppConfig {

    public MemberService memberService() {
        return new MemberServiceImpl(new MemoryMemberRepository());
    }

    public OrderService orderService() {
        return new OrderServiceImpl(new MemoryMemberRepository(), new FixDiscountPolicy());
    }

}
