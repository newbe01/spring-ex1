package com.example.spring1;

import com.example.spring1.member.Grade;
import com.example.spring1.member.Member;
import com.example.spring1.member.MemberService;
import com.example.spring1.member.MemberServiceImpl;
import com.example.spring1.order.Order;
import com.example.spring1.order.OrderService;
import com.example.spring1.order.OrderServiceImpl;

public class OrderApp {

    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();
        OrderService orderService = new OrderServiceImpl();

        Long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "itemA", 10000);

        System.out.println("order = " + order);

    }

}
