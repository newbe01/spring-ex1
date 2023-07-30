package com.example.spring1;

import com.example.spring1.discount.DiscountPolicy;
import com.example.spring1.discount.FixDiscountPolicy;
import com.example.spring1.member.MemberRepository;
import com.example.spring1.member.MemberService;
import com.example.spring1.member.MemberServiceImpl;
import com.example.spring1.member.MemoryMemberRepository;
import com.example.spring1.order.OrderService;
import com.example.spring1.order.OrderServiceImpl;

public class AppConfig {

    public MemberService memberService() {
        return new MemberServiceImpl(memberRepository());
    }


    public OrderService orderService() {
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }

    private static MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    private static DiscountPolicy discountPolicy() {
        return new FixDiscountPolicy();
    }

}
