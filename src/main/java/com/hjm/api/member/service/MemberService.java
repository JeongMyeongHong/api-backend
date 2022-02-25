package com.hjm.api.member.service;

import com.hjm.api.member.domain.CalcDTO;
import com.hjm.api.member.domain.MemberDTO;
import com.hjm.api.member.repository.MemberRepository;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * packageName   :   com.hjm.api.member.service
 * fileName      :   MemberService
 * author        :   JeongMyeongHong
 * date          :   2022-02-11
 * desc          :
 * ============================================
 * DATE             AUTHOR              NOTE
 * ============================================
 * 2022-02-11      JeongmyoengHong     최초 생성
 */
public interface MemberService {

    String calc(CalcDTO calc);

    String bmi(MemberDTO member);

    String grade(MemberDTO member);

    String login(MemberDTO member);

    String sort(CalcDTO calc);
}
