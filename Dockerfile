# Mavenベースイメージを使用
FROM maven:3.6.3-jdk-11 as builder

# 作業ディレクトリを設定
WORKDIR /app

# ソースコードとpom.xmlをコピー
COPY src /app/src
COPY pom.xml /app

# 依存関係をインストールし、テストを実行
RUN mvn clean test

# アプリケーションをパッケージ化
RUN mvn package

# 実行用の軽量なJavaイメージを使用
FROM openjdk:11-jre-slim

WORKDIR /app

# ビルドしたjarファイルをコピー
COPY --from=builder /app/target/*.jar /app/app.jar

# Battleクラスを実行
CMD ["java", "-jar", "app.jar"]