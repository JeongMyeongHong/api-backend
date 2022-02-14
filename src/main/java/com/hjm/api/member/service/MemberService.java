package com.hjm.api.member.service;

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
    String showMemberList();
    String showMemberInfo();
    String showShipmentList();
    String registerSendMail();
    String showMileageList();
    String showMileage();
    String saveMileage();
    String deleteMileage();
}
