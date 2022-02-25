package com.hjm.api.member.controller;

import com.hjm.api.member.domain.CalcDTO;
import com.hjm.api.member.domain.MemberDTO;
import com.hjm.api.member.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

/**
 * packageName   :   com.hjm.api.member.controller
 * fileName      :   MemberController
 * author        :   JeongMyeongHong
 * date          :   2022-02-11
 * desc          :
 * ============================================
 * DATE             AUTHOR              NOTE
 * ============================================
 * 2022-02-11      JeongmyoengHong     최초 생성
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/member")

public class MemberController {

    private final MemberService service;

    @PostMapping("/bmi")
    public String getBmi(@RequestBody MemberDTO member) {
        System.out.println(" 리액트에서 넘어온 이름: " + member.getName());
        System.out.println(" 리액트에서 넘어온 키: " + member.getHeight());
        System.out.println(" 리액트에서 넘어온 몸무게: " + member.getWeight());
        return service.bmi(member);
    }

    @PostMapping("/calc")
    public String Calc(@RequestBody CalcDTO calc) {
        System.out.println(" 리액트에서 넘어온 num1: " + calc.getNum1());
        System.out.println(" 리액트에서 넘어온 opcode: " + calc.getOpcode());
        System.out.println(" 리액트에서 넘어온 num2: " + calc.getNum2());
        return service.calc(calc);
    }

    @PostMapping("/sort")
    public String Sort(@RequestBody CalcDTO calc) {
        for (int i = 0; i < 6; i++) {
            System.out.println("리액트에서 넘어온 " + i + "번째 값" + calc.getInputs()[i]);
        }
        System.out.println("리액트에서 넘어온 " + 0 + "번째 값" + calc.getInputs()[0]);
        return service.sort(calc);
    }

    @PostMapping("/grade")
    public String getGrade(@RequestBody MemberDTO member) {
        System.out.println(" 리액트에서 넘어온 name: " + member.getName());
        System.out.println(" 리액트에서 넘어온 math: " + member.getMath());
        System.out.println(" 리액트에서 넘어온 kr: " + member.getKr());
        System.out.println(" 리액트에서 넘어온 en: " + member.getEn());
        return service.grade(member);
    }

    @PostMapping("/login")
    public String Login(@RequestBody MemberDTO member) {
        System.out.println(" 리액트에서 넘어온 id: " + member.getUserId());
        System.out.println(" 리액트에서 넘어온 pw: " + member.getPw());
        return service.login(member);
    }
}
