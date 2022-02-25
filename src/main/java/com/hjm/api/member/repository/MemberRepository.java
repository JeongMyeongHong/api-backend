package com.hjm.api.member.repository;

import com.hjm.api.member.domain.CalcDTO;
import com.hjm.api.member.domain.MemberDTO;

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
public interface MemberRepository {

    String bmi(MemberDTO member);

    String grade(MemberDTO member);

    String login(MemberDTO member);
}
