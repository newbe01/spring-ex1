package com.example.spring1.discount;

import com.example.spring1.member.Grade;
import com.example.spring1.member.Member;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Qualifier("fixDiscountPolicy")
@Component
public class FixDiscountPolicy implements DiscountPolicy {

    private int discountFixAmount = 1000;

    @Override
    public int discount(Member member, int price) {

        if (member.getGrade() == Grade.VIP) {
            return discountFixAmount;
        } else {
            return 0;
        }

    }

}
