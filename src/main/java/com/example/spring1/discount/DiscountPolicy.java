package com.example.spring1.discount;

import com.example.spring1.member.Member;

public interface DiscountPolicy {

    /**
     * @return 할인금액
     */
    int discount(Member member, int price);

}
