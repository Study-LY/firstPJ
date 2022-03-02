package com.example.firstPJ;

import com.example.firstPJ.Domain.Member;
import com.example.firstPJ.Service.MemberService;
import com.example.firstPJ.Service.MemberServiceImpl;

public class MemberTest {
    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();
        Member member = new Member("aaa@na.ke","1234", "1234","홍길동", "2000","12", "12", "1","010-222-222");
        memberService.join(member);


        Member findById = memberService.findById("aaa@na.ke");
        Member findByPW = memberService.findByPw("1234");
        System.out.println("new member = " + member);
        System.out.println("findById = " + findById );
        System.out.println("findByPW = " + findByPW);

        //soutv 단축키 쓰면 편함
    }
}
