package capstondesign2.backend.statistics.timeScoreList.controller;

import capstondesign2.backend.statistics.timeScoreList.dto.TimeScoreRequestDTO;
import capstondesign2.backend.statistics.timeScoreList.dto.TimeScoreResponseDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TimeScoreListController {

    TimeScoreRequestDTO timeScoreRequestDTO = new TimeScoreRequestDTO();
    TimeScoreResponseDTO timeScoreResponseDTO = new TimeScoreResponseDTO();

    List<TimeScoreRequestDTO> timeScoreList = new ArrayList<>();


    @PostMapping("/time-score-list/send-time-score-list")
    public void sendTimeScoreList(@RequestBody TimeScoreRequestDTO timeScoreRequestDTO) {

        // <시간, 점수> 설정
        timeScoreRequestDTO.setTime(timeScoreRequestDTO.getTime());
        timeScoreRequestDTO.setScore(timeScoreRequestDTO.getScore());

        // 배열에 저장
        timeScoreList.add(timeScoreRequestDTO);

        // DTO에 저장
        timeScoreResponseDTO.setTimeScoreList(timeScoreList);

        System.out.println("<시간, 점수> 배열 입력 완료: " + timeScoreResponseDTO);
    }

    @GetMapping("/time-score-list/get-time-score-list")
    public TimeScoreResponseDTO getTimeScoreList() {
        return timeScoreResponseDTO;
    }


}