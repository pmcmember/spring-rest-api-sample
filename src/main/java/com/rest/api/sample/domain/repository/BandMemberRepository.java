package com.rest.api.sample.domain.repository;

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
    public BandMember fetchByMemberId(final Long memberId){
        return bandMemberMapper.fetchByMemberId(memberId);
    }
}
