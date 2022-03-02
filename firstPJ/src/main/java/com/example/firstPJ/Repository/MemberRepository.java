package com.example.firstPJ.Repository;

import com.example.firstPJ.Domain.Member;

public interface MemberRepository {
    void save(Member member); //회원을 저장
    
    Member findById(String user_ID); //회원의 아이디 찾기
    
    Member findByPw(String user_PW1); //회원의 비밀번호 찾기
}
