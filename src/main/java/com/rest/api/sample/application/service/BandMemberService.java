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
     * BandMemberテーブル データの取得を行う
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
     * BandMemberテーブル データの登録を行う
     *
     * @param bandMember : 登録データ
     * @return : 登録件数
     */
    public int insertMember(final BandMemberForm bandMember) {
        log.info("メンバー情報を登録します。");
        int insertCount = bandMemberRepository.insertMember(bandMember);
        log.info("登録件数 : {}", insertCount);
        return insertCount;
    }

    /**
     * BandMemberテーブル データの更新を行う
     *
     * @param bandMember : 登録データ
     * @return : 更新件数
     */
    public int updateMember(final BandMemberForm bandMember) {
        log.info("メンバー情報を更新します。");
        int updateCount = bandMemberRepository.updateMember(bandMember);
        log.info("更新件数 : {}", updateCount);
        return updateCount;
    }

    /**
     * BandMemberテーブル データの削除を行う
     *
     * @param memberId : メンバーID
     * @return : 削除件数
     */
    public int deleteByMemberId(final Long memberId) {
        log.info("メンバー情報を削除します。");
        final int deleteCount = bandMemberRepository.deleteByMemberId(memberId);
        log.info("削除件数 : {}", deleteCount);
        return deleteCount;
    }
}
