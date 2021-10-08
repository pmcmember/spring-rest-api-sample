package com.rest.api.sample.controller;

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
 * Sample RestController
 * curlでの例はREADME.md参照
 */
@Slf4j
@RestController
@RequestMapping(value = "api/v1/")
@RequiredArgsConstructor
public class SampleController {

    /**
     * GET データの取得
     * 以下のような形式で リクエストを送信 {id} の箇所には任意の数字を設定(動的に採番される)
     * GET http://localhost:8080/api/v1/samples/{id}
     *
     * @param id : 取得対象データのID
     * @return レスポンス
     */
    @GetMapping(value = "samples/{id}")
    public ResponseEntity<?> get(@PathVariable("id") Long id){
        log.info("GET Restリクエストを受信しました。　ID : {}",id);

        int mockResponseCode = 200;

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);
        return new ResponseEntity<>(mockResponseCode,httpHeaders, HttpStatus.OK);
    }
}
