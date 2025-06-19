FROM amazoncorretto:17

# 타임존 설정
ENV TZ=Asia/Seoul
RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone

# JAR 경로 설정 (GitHub Actions나 Docker build 시 ARG로 들어옴)
ARG JAR_FILE=build/libs/*.jar

# JAR 파일 복사
COPY ${JAR_FILE} app.jar

# 앱 실행
ENTRYPOINT ["java", "-jar", "/app.jar"]
