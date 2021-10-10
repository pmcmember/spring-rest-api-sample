package com.rest.api.sample.application.controller;

import com.rest.api.sample.application.form.BandMemberForm;
import com.rest.api.sample.application.service.BandMemberService;
import com.rest.api.sample.domain.entity.BandMember;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Sampleソース
 * BandMemberテーブル操作用のRestController
 * curlでの例はREADME.md参照
 */
@Slf4j
@RestController
@RequestMapping(value = "api/v1/band/")
@RequiredArgsConstructor
public class BandMemberController {

    private final HttpHeaders restJsonHeaders;
    private final BandMemberService bandMemberService;

    /**
     * GET データの取得
     *
     * @param id : 取得対象データのID
     * @return 取得データ
     */
    @GetMapping(value = "member/{id}")
    public ResponseEntity<BandMember> get(@PathVariable("id") Long id) {
        log.info("GET Restリクエストを受信しました。　ID : {}", id);
        return new ResponseEntity<>(
                bandMemberService.fetchMemberByMemberId(id), restJsonHeaders, HttpStatus.OK
        );
    }

    /**
     * Post データの登録
     *
     * @param body : json形式での取得対象データ
     * @return 登録データ件数
     */
    @PostMapping(value = "member")
    public ResponseEntity<?> post(@RequestBody BandMemberForm body) {
        log.info("Post Restリクエストを受信しました。　body : {}", body);
        return new ResponseEntity<>(
                bandMemberService.insertMember(body), restJsonHeaders, HttpStatus.OK
        );
    }
}
