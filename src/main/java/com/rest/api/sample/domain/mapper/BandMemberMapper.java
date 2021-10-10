package com.rest.api.sample.domain.mapper;

import com.rest.api.sample.application.form.BandMemberForm;
import com.rest.api.sample.domain.entity.BandMember;
import org.apache.ibatis.annotations.Mapper;

/**
 * BandMemberテーブル Mapper IF
 * xmlファイルに定義されたメソッド名と名称の一致するSQLの実行を行う
 */
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

    /**
     * データの更新を行う
     *
     * @param bandMember : 更新データ
     * @return : 更新件数
     */
    int updateMember(final BandMemberForm bandMember);

    /**
     * データの削除を行う
     *
     * @param memberId : メンバーID
     * @return : 削除件数
     */
    int deleteByMemberId(final Long memberId);

}
