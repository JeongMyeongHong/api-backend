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
    private String uesrId;
    private String name;
    private String address;
    private String phone;
    private int height;
    private int weight;
    private String debutDate;
}
