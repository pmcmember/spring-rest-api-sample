# spring-rest-api-sample
Spring Boot使用時の CRUDが出来る Rest Api サンプルソース<br>
ブランチ切るかforkした上で 自由に練習に使ってください

## 標準導入環境
- java 11
- Spring Boot 2.5.4
- Junit5
- Gradle
- h2
- PostgreSQL 13.4
- My Batis

## curlコマンドメモ
~~~
■ GET
curl -X GET http://localhost:8080/api/v1/band/member/{id}

■ POST
curl -H "content-type: application/json" -X POST -d'{ "lastName" : "テスト", "firstName" : "次郎", "age" : 20, "part" : "ベース"}' http://localhost:8080/api/v1/band/member/

■ PUT
curl -H "content-type: application/json" -X PUT -d'{ "lastName" : "テスト", "firstName" : "三郎", "age" : 20, "part" : "ドラム"}' http://localhost:8080/api/v1/band/member/{id}

■ DELETE
curl -X DELETE http://localhost:8080/api/v1/band/member/{id}
~~~

## 参考ページ
- [Spring MVC コントローラの引数](https://qiita.com/MizoguchiKenji/items/2a041f3a3eb13274e55c)
- [curlコマンドでちょこっとHTTPリクエストを試すだけの記事](https://qiita.com/akane_kato/items/34b408336f4ec372b139#curl%E3%81%AE%E5%9F%BA%E6%9C%AC%E3%81%AE%E4%BD%BF%E3%81%84%E6%96%B9)
- [Spring Bootでよく使うアノテーション一覧](https://learning-collection.com/spring-boot%E3%81%A7%E3%82%88%E3%81%8F%E4%BD%BF%E3%81%86%E3%82%A2%E3%83%8E%E3%83%86%E3%83%BC%E3%82%B7%E3%83%A7%E3%83%B3%E4%B8%80%E8%A6%A7/)
- [絶対分かるMyBatis！MyBatisで覚えるべきチェックルール25（前半）](https://qiita.com/5zm/items/e1faac61a1d00998fb1f)
- [Spring Boot入門① ～DI～](https://qiita.com/gksdyd88/items/7886f54ee8a22d311400)