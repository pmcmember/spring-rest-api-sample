package com.rest.api.sample.application.controller;

import com.rest.api.sample.application.service.BandMemberService;
import com.rest.api.sample.domain.entity.BandMember;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Sampleソース
 * BandMemberテーブル操作用のRestController
 * curlでの例はREADME.md参照
 */
@Slf4j
@RestController
@RequestMapping(value = "api/v1/band")
@RequiredArgsConstructor
public class BandMemberController {

    private final BandMemberService bandMemberService;

    /**
     * GET データの取得
     * 以下のような形式で リクエストを送信 {id} の箇所には任意の数字を設定(動的に採番される)
     * GET http://localhost:8080/api/v1/samples/{id}
     *
     * @param id : 取得対象データのID
     * @return レスポンス
     */
    @GetMapping(value = "member/{id}")
    public ResponseEntity<BandMember> get(@PathVariable("id") Long id){
        log.info("GET Restリクエストを受信しました。　ID : {}",id);
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        return new ResponseEntity<>(bandMemberService.fetchMemberByMemberId(id),httpHeaders, HttpStatus.OK);
    }
}
