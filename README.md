# spring-rest-api-sample
Spring Boot使用時の CRUDが出来る Rest Api サンプルソース<br>
ブランチ切るかforkした上で 自由に練習に使ってください 

## curlメモ
[curlコマンドでちょこっとHTTPリクエストを試すだけの記事](https://qiita.com/akane_kato/items/34b408336f4ec372b139#curl%E3%81%AE%E5%9F%BA%E6%9C%AC%E3%81%AE%E4%BD%BF%E3%81%84%E6%96%B9)

~~~
■ GET
curl -X GET http://localhost:8080/api/v1/samples/{id}

~~~

## 標準導入環境
- java 11
- Spring Boot 2.5.4
- Junit5
- Gradle
- h2
- PostgreSQL 13.4
- My Batis

## 注意
~~~
ブランチの保護有効にしているので以下の制限があります
・藤井以外はmasterに直プッシュできません。
・masterマージ時は PR発行の上 approve必須となります。
~~~