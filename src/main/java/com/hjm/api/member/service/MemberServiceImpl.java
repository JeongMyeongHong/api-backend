package com.hjm.api.member.service;

import com.hjm.api.member.domain.CalcDTO;
import com.hjm.api.member.domain.MemberDTO;
import com.hjm.api.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * packageName   :   com.hjm.api.member.service
 * fileName      :   MemberServiceImpl
 * author        :   JeongMyeongHong
 * date          :   2022-02-11
 * desc          :
 * ============================================
 * DATE             AUTHOR              NOTE
 * ============================================
 * 2022-02-11      JeongmyoengHong     최초 생성
 */

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService {
    private final MemberRepository repository;

    @Override
    public String calc(CalcDTO calc) {
        int num1 = calc.getNum1();
        int num2 = calc.getNum2();
        String opcode = calc.getOpcode();
        int res = 0;
        switch (opcode) {
            case "+":
                res = num1 + num2;
                break;
            case "-":
                res = num1 - num2;
                break;
            case "*":
                res = num1 * num2;
                break;
            case "/":
                res = num1 / num2;
                break;
            case "%":
                res = num1 % num2;
                break;
        }
        return String.format("%d %s %d = %d", num1, opcode, num2, res);
    }

    @Override
    public String bmi(MemberDTO member) {
        String name = member.getName();
        double bmi = member.getWeight() * 10000 / (member.getHeight() * member.getHeight());
        String res = "";
        if (bmi >= 25) {
            res = "비만";
        } else if (bmi >= 23) {
            res = "과체중";
        } else if (bmi >= 18.5) {
            res = "정상";
        } else {
            res = "저체중";
        }
        return String.format("[%s] 님은 [%s] 입니다.", name, res);
    }

    @Override
    public String grade(MemberDTO member) {
        return (member.getMath() + member.getKr() + member.getEn() >= 180)
                ? member.getName() + "님은 합격입니다"
                : member.getName() + "님은 불합격입니다";
    }

    @Override
    public String login(MemberDTO member) {
        return member.getPw().equals("0000")
                ? member.getUserId() + "님 로그인 성공"
                : member.getUserId() + "님 로그인 실패";
    }

    @Override
    public String sort(CalcDTO calc) {
        return null;
    }
}
