package com.example.firstPJ.Service;

import com.example.firstPJ.Domain.Member;

public interface MemberService {

    void join(Member member); //회원 가입

    Member findById(String user_ID); //아이디 찾기

    Member findByPw(String user_PW1); // 비밀번호 찾기
}
