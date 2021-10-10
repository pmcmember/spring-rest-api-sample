package com.rest.api.sample.domain.entity;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * BandMemberテーブル エンティティ
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BandMember {

    // primary key
    private Long memberId;
    private String lastName;
    private String firstName;
    private Integer age;
    private String part;
    private LocalDateTime createdAt;
    private String createUser;
    private LocalDateTime updateAt;
    private String updateUser;
    private String deleteFlg;
}
