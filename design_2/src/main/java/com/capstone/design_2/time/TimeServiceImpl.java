package com.capstone.design_2.time;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TimeServiceImpl implements TimeService {

    // LocalDateTime을 계산 가능한 형태로 바꿔주기
    @Override
    public String formatTime(String time) {
        // LocalDateTime을 계산 가능한 형태로 바꿔주기

        try {
            DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            LocalDateTime dateTime = LocalDateTime.parse(time, inputFormatter);

            return dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
        } catch (Exception e) {
            // 예외 처리
            System.err.println("시간 형식 변환 중 오류 발생: " + e.getMessage());
            return "";
        }
    }


    @Override
    public String calculateTime(String startTimeStr, String endTimeStr) {
        // formatTime 메서드를 사용하여 입력 문자열을 ISO_LOCAL_DATE_TIME 형식으로 변환

        try{
            String formattedStartTime = formatTime(startTimeStr);
            String formattedEndTime = formatTime(endTimeStr);


            // 빈 문자열이 반환된 경우 오류 처리
            if (formattedStartTime.isEmpty() || formattedEndTime.isEmpty()) {
                System.err.println("시간 형식 변환 실패");
                return "00:00:00";
            }

            // 변환된 문자열을 LocalDateTime 객체로 파싱
            LocalDateTime startTime = LocalDateTime.parse(formattedStartTime);
            LocalDateTime endTime = LocalDateTime.parse(formattedEndTime);

            // Duration 객체를 사용하여 두 시간 간의 차이 계산
            Duration duration = Duration.between(startTime, endTime);

            // 초 단위로 총 경과 시간 계산
            long totalSeconds = duration.getSeconds();
            // 음수 값 처리 (시작 시간이 종료 시간보다 나중인 경우)
            boolean isNegative = totalSeconds < 0;
            if (isNegative) {
                totalSeconds = Math.abs(totalSeconds);
            }

            // 시, 분, 초 계산
            long hours = totalSeconds / 3600;
            long minutes = (totalSeconds % 3600) / 60;
            long seconds = totalSeconds % 60;

            // 결과 포맷팅 (음수 처리 포함)
            String result = String.format("%02d:%02d:%02d", hours, minutes, seconds);
            return isNegative ? "-" + result : result;
        } catch (Exception e) {
            System.err.println("시간 차이 계산 중 오류 발생: " + e.getMessage());
            return "00:00:00";
        }
    }
}
