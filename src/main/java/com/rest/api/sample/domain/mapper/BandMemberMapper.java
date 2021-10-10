package com.rest.api.sample.domain.mapper;

import com.rest.api.sample.application.form.BandMemberForm;
import com.rest.api.sample.domain.entity.BandMember;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BandMemberMapper {

    /**
     * データの取得を行う
     *
     * @param memberId : メンバーID
     * @return : メンバー情報
     */
    BandMember fetchByMemberId(final Long memberId);

    /**
     * データの登録を行う
     *
     * @param bandMember : 登録データ
     * @return : 登録件数
     */
    int insertMember(final BandMemberForm bandMember);
}
