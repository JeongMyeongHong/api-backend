package com.hjm.api.member.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * packageName   :   com.hjm.api.member.domain
 * fileName      :   MemberDTO
 * author        :   JeongMyeongHong
 * date          :   2022-02-11
 * desc          :
 * ============================================
 * DATE             AUTHOR              NOTE
 * ============================================
 * 2022-02-11      JeongmyoengHong     최초 생성
 */
@Data
@Component
public class MemberDTO {
    private String userId;
    private String name;
    private String address;
    private String phone;
    private double height;
    private double weight;
    private String debutDate;
    private int math;
    private int kr;
    private int en;
    private String pw;
}
