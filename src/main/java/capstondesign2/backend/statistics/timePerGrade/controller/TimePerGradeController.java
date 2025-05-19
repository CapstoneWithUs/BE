package capstondesign2.backend.statistics.timePerGrade.controller;

import capstondesign2.backend.statistics.timePerGrade.dto.TimePerGradeRequestDTO;
import capstondesign2.backend.statistics.timePerGrade.dto.TimePerGradeResponseDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TimePerGradeController {

    TimePerGradeResponseDTO timePerGradeResponseDTO = new TimePerGradeResponseDTO();


    @PostMapping("/time-per-grade/send-time-per-grade")
    public void sendTimePerGrade(@RequestBody TimePerGradeRequestDTO timePerGradeRequestDTO) {

        timePerGradeResponseDTO.setGradeATime(timePerGradeRequestDTO.getGradeATime());
        timePerGradeResponseDTO.setGradeBTime(timePerGradeRequestDTO.getGradeBTime());
        timePerGradeResponseDTO.setGradeCTime(timePerGradeRequestDTO.getGradeCTime());
        timePerGradeResponseDTO.setGradeDTime(timePerGradeRequestDTO.getGradeDTime());

        System.out.println(timePerGradeResponseDTO + " 입력 완료");
    }

    @GetMapping("/time-per-grade/get-time-per-grade")
    public TimePerGradeResponseDTO getTimePerGrade() {
        return timePerGradeResponseDTO;
    }
}
