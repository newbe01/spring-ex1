package com.example.spring1;

import com.example.spring1.member.Grade;
import com.example.spring1.member.Member;
import com.example.spring1.member.MemberService;
import com.example.spring1.member.MemberServiceImpl;

public class MemberApp {

    public static void main(String[] args) {

//        MemberService memberService = new MemberServiceImpl();
        AppConfig appConfig = new AppConfig();
        MemberService memberService = appConfig.memberService();

        Member member = new Member(1L, "MemberA", Grade.VIP);

        memberService.join(member);

        Member member1 = memberService.findMember(1L);
        System.out.println("member = " + member.getName());
        System.out.println("member1 = " + member1.getName());

    }

}
