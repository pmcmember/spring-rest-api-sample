package com.rest.api.sample.application.service;

import com.rest.api.sample.domain.entity.BandMember;
import com.rest.api.sample.domain.repository.BandMemberRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * BandMemberテーブル サービス
 */
@Slf4j
@Service
@Transactional
@RequiredArgsConstructor
public class BandMemberService {

    private final BandMemberRepository bandMemberRepository;

    /**
     * BandMemberテーブルから データの取得を行う
     * @param memberId : メンバーID
     * @return : 取得結果
     */
    public BandMember fetchMemberByMemberId(final Long memberId){
        log.info("メンバー情報を取得します。 ID : {}",memberId);
        final BandMember member = bandMemberRepository.fetchByMemberId(memberId);
        log.info("取得結果 : {}",member);
        return  member;
    }
}
