package com.example.spring1.beanfind;

import com.example.spring1.AppConfig;
import com.example.spring1.member.MemberService;
import com.example.spring1.member.MemberServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.assertj.core.api.Assertions.assertThat;

public class ApplicationContextBasicFindTest {

    AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

    @DisplayName("bean name scan")
    @Test
    void findBeanByName() {

        MemberService memberService = ac.getBean("memberService", MemberService.class);
        System.out.println("memberService = " + memberService);
        System.out.println("memberService = " + memberService.getClass());

        assertThat(memberService).isInstanceOf(MemberServiceImpl.class);
    }

    @DisplayName("bean type scan")
    @Test
    void findBeanByType() {

        MemberService memberService = ac.getBean(MemberService.class);
        System.out.println("memberService = " + memberService);
        System.out.println("memberService = " + memberService.getClass());

        assertThat(memberService).isInstanceOf(MemberServiceImpl.class);
    }

    @DisplayName("bean Implement type scan")
    @Test
    void findBeanByImplType() {

        MemberService memberService = ac.getBean(MemberServiceImpl.class);
        System.out.println("memberService = " + memberService);
        System.out.println("memberService = " + memberService.getClass());

        assertThat(memberService).isInstanceOf(MemberServiceImpl.class);
    }

    @DisplayName("bean name scan X")
    @Test
    void findBeanByNameX() {
//        MemberService xxxx = ac.getBean("xxxx", MemberService.class);

        Assertions.assertThrows(NoSuchBeanDefinitionException.class,
                () -> ac.getBean("xxxx", MemberService.class));

    }

}
