package com.example.firstPJ.Repository;

import com.example.firstPJ.Domain.Member;

import java.util.HashMap;
import java.util.Map;

public class MemoryMemberRepository implements MemberRepository { //인터페이스와 별개로 구현체

    private static Map<String, Member> store = new HashMap<>(); //Member 도메인에서 만든 것을 store에 저장

    @Override
    public void save(Member member) {
        store.put(member.getUser_ID(), member);
        store.put(member.getUser_name(), member);
        store.put(member.getUser_PW1(), member);
        store.put(member.getUser_PW2(), member);
        store.put(member.getYear(), member);
        store.put(member.getMonth(), member);
        store.put(member.getDay(), member);
        store.put(member.getGender(), member);
        store.put(member.getUser_phone(), member);
    }

    @Override
    public Member findById(String user_ID) {
        return store.get(user_ID);
    }

    @Override
    public Member findByPw(String user_PW1) {
        return store.get(user_PW1);
    }
}
