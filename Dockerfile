FROM amazoncorretto:17

# Timezone 설정
ENV TZ=Asia/Seoul
RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone

# JAR 파일 경로 ARG
ARG JAR_FILE=build/libs/*.jar

# 복사 시 .jar가 여러 개일 가능성 방지
COPY ${JAR_FILE} app.jar

# 엔트리포인트 설정
ENTRYPOINT ["java", "-jar", "/app.jar"]
