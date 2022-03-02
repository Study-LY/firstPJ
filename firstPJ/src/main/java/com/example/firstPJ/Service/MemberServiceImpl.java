package com.example.firstPJ.Service;

import com.example.firstPJ.Domain.Member;
import com.example.firstPJ.Repository.MemberRepository;
import com.example.firstPJ.Repository.MemoryMemberRepository;

public class MemberServiceImpl implements MemberService{ //구현체가 하나일 경우 클래스명을 인터페이스명+Impl이라고 많이 씀

    private final MemberRepository memberRepository = new MemoryMemberRepository(); //MemberRepository는 인터페이스라 구현체가 없어 new 이후 구현체 지정

    @Override
    public void join(Member member) {
        memberRepository.save(member); //memberRepository 구현체에 저장한save(member) 가져옴
    }

    @Override
    public Member findById(String user_ID) {
        return memberRepository.findById(user_ID);
    }

    @Override
    public Member findByPw(String user_PW1) {
        return memberRepository.findByPw(user_PW1);
    }

}
