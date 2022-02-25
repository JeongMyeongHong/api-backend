package com.hjm.api.member.repository;

import com.hjm.api.member.domain.CalcDTO;
import com.hjm.api.member.domain.MemberDTO;
import org.springframework.stereotype.Repository;

/**
 * packageName   :   com.hjm.api.member.repository
 * fileName      :   MemberRepository
 * author        :   JeongMyeongHong
 * date          :   2022-02-11
 * desc          :
 * ============================================
 * DATE             AUTHOR              NOTE
 * ============================================
 * 2022-02-11      JeongmyoengHong     최초 생성
 */
@Repository
public class MemberRepositoryImpl implements MemberRepository{
    @Override
    public String bmi(MemberDTO member) {
        return null;
    }

    @Override
    public String grade(MemberDTO member) {
        return null;
    }

    @Override
    public String login(MemberDTO member) {
        return null;
    }
}
