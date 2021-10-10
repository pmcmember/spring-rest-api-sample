package com.rest.api.sample.domain.repository;

import com.rest.api.sample.application.form.BandMemberForm;
import com.rest.api.sample.domain.entity.BandMember;
import com.rest.api.sample.domain.mapper.BandMemberMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

@Slf4j
@Repository
@RequiredArgsConstructor
public class BandMemberRepository {

    private final BandMemberMapper bandMemberMapper;

    /**
     * データの取得を行う
     *
     * @param memberId : メンバーID
     * @return : メンバー情報
     */
    public BandMember fetchByMemberId(final Long memberId) {
        return bandMemberMapper.fetchByMemberId(memberId);
    }

    /**
     * データの登録を行う
     *
     * @param bandMember : 登録データ
     * @return : 登録件数
     */
    public int insertMember(final BandMemberForm bandMember) {
        return bandMemberMapper.insertMember(bandMember);
    }

    /**
     * データの更新を行う
     *
     * @param bandMember : 更新データ
     * @return : 更新件数
     */
    public int updateMember(final BandMemberForm bandMember) {
        return bandMemberMapper.updateMember(bandMember);
    }

    /**
     * データの削除を行う
     *
     * @param memberId : メンバーID
     * @return : 削除件数
     */
    public int deleteByMemberId(final Long memberId) {
        return bandMemberMapper.deleteByMemberId(memberId);
    }
}
