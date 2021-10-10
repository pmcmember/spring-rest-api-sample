package com.rest.api.sample.application.form;

import lombok.Data;

/**
 * BandMember Formクラス
 */
@Data
public class BandMemberForm {

    private Long memberId;
    private String lastName;
    private String firstName;
    private Integer age;
    private String part;
}
