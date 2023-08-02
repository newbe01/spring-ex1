package com.example.spring1.order;

import com.example.spring1.discount.DiscountPolicy;
import com.example.spring1.discount.FixDiscountPolicy;
import com.example.spring1.discount.RateDiscountPolicy;
import com.example.spring1.member.Member;
import com.example.spring1.member.MemberRepository;
import com.example.spring1.member.MemoryMemberRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class OrderServiceImpl implements OrderService {

//    private final MemberRepository memberRepository = new MemoryMemberRepository();
//    private final DiscountPolicy discountPolicy = new FixDiscountPolicy();
//    private final DiscountPolicy discountPolicy = new RateDiscountPolicy();
    private final MemberRepository memberRepository;
    private final DiscountPolicy discountPolicy;

    public OrderServiceImpl(MemberRepository memberRepository, DiscountPolicy discountPolicy) {
        this.memberRepository = memberRepository;
        this.discountPolicy = discountPolicy;
    }

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {

        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);


        return new Order(memberId, itemName, itemPrice, discountPrice);
    }

    //test
    public MemberRepository getMemberRepository() {
        return memberRepository;
    }
}
