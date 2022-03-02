package com.example.firstPJ.member;

import com.example.firstPJ.Domain.Member;
import com.example.firstPJ.Service.MemberService;
import com.example.firstPJ.Service.MemberServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class MemberServiceTest {

    MemberService memberService = new MemberServiceImpl();
    @Test
    void join(){
        //given
         Member member = new Member("sss@sss.sss","1234","1234","홍홍","2000", "12","21","1","010-222-222");

         //when
        memberService.join(member);
        Member findById = memberService.findById("sss@sss.sss");
        Member findByPW = memberService.findByPw("1234");

        //then
        Assertions.assertThat(member).isEqualTo(findById);
        Assertions.assertThat(member).isEqualTo(findByPW);
    }
}
