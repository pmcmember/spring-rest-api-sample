package com.rest.api.sample.application.service;

import com.rest.api.sample.application.form.BandMemberForm;
import com.rest.api.sample.domain.entity.BandMember;
import com.rest.api.sample.domain.repository.BandMemberRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * BandMemberテーブル サービス
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class BandMemberService {

    private final BandMemberRepository bandMemberRepository;

    /**
     * BandMemberテーブルから データの取得を行う
     *
     * @param memberId : メンバーID
     * @return : 取得結果
     */
    public BandMember fetchMemberByMemberId(final Long memberId) {
        log.info("メンバー情報を取得します。");
        final BandMember member = bandMemberRepository.fetchByMemberId(memberId);
        log.info("取得結果 : {}", member);
        return member;
    }

    /**
     * BandMemberテーブルへ データの登録を行う
     *s
     * @param bandMember : 登録データ
     * @return : 登録件数
     */
    public int insertMember(final BandMemberForm bandMember) {
        log.info("メンバー情報を登録します。");
        int insertCount = bandMemberRepository.insertMember(bandMember);
        log.info("登録件数 : {}", insertCount);
        return insertCount;
    }
}
