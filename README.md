![Java CI](https://github.com/tmdtky/java-fizzbuzz/actions/workflows/java-ci.yml/badge.svg)

# java-battle-simulation
Java11を用いてRPGのような戦いを表現
# 仕様
- 勇者と魔王はそれぞれHP（体力）と攻撃力を持ちます。
- 相互に攻撃し合い、お互いに相手の攻撃力分のダメージを受けるものとします。（攻撃した側の攻撃力分、相手のHPが減るものとします。）
- 勇者と魔王をclass及びインスタンスで表現し、下記の実行結果の表示イメージのように動作するプログラムを作成してください。
- 継承関係や関数（メソッド）の作り方は自由とします。
- 初期のHPや攻撃力は固定でかまいません。
- 勇者から攻撃を始めるのは固定でかまいません。
- どちらかのHPが「ゼロになった時点で」バトルは終了します。（例えば勇者の攻撃時点で魔王は倒れていたら魔王は攻撃できません）
- 勇者が倒れたパターンと魔王が倒れたパターンの表示結果を用意してください。
- 一定確率で攻撃にミス（専用表示でHPが減らない）が発生する
- 一定確率でクリティカルアタック（専用表示で相手の減るHP量が1.5倍）が発生する

# Features
- JUnit5によるテストコードの作成
- Docker、docker-composeによる環境構築
- GitHub Actionによる自動テスト

# Usage
- Docker Desktopを事前に起動してください。
- 起動方法
```bash
git clone https://github.com/tmdtky/java-battle-simulation.git
cd <git cloneしたディレクトリ>
docker-compose up --build
```
- 起動後のdockerプロセス削除方法
```bash
docker-compose down
```
- テスト単体の実施方法
```bash
cd <git cloneしたディレクトリ>
mvn clean test
```

# Note
docker-composeを起動した際、ビルド及びテストが成功した場合、
アプリケーションが実行されます。
