package com.example.spring1.discount;

import com.example.spring1.annotation.MainDiscountPolicy;
import com.example.spring1.member.Grade;
import com.example.spring1.member.Member;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Qualifier("mainDiscountPolicy")
//@Primary
@MainDiscountPolicy
@Component
public class RateDiscountPolicy implements DiscountPolicy {

    private int discountPercent = 10;

    @Override
    public int discount(Member member, int price) {

        if (member.getGrade() == Grade.VIP) {
            return price * discountPercent / 100;
        } else {
            return 0;
        }

    }

}
