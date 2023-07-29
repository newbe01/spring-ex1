package com.example.spring1.discount;

import com.example.spring1.member.Grade;
import com.example.spring1.member.Member;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RateDiscountPolicyTest {

    RateDiscountPolicy discountPolicy = new RateDiscountPolicy();

    @DisplayName("VIP - 10% discount")
    @Test
    void vip() {

        //given
        Member member = new Member(1L, "VIP", Grade.VIP);

        //when
        int discount = discountPolicy.discount(member, 10000);

        //then
        assertThat(discount).isEqualTo(1000);

    }

    @DisplayName("Not VIP - no discount")
    @Test
    void notVip() {

        //given
        Member member = new Member(1L, "BASIC", Grade.BASIC);

        //when
        int discount = discountPolicy.discount(member, 10000);

        //then
        assertThat(discount).isEqualTo(0);

    }

}
