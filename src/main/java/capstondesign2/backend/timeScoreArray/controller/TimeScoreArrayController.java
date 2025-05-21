package capstondesign2.backend.timeScoreArray.controller;

import capstondesign2.backend.timeScoreArray.dto.TimeScoreArrayRequestDTO;
import capstondesign2.backend.timeScoreArray.dto.TimeScoreArrayResponseDTO;
import capstondesign2.backend.timeScoreArray.service.TimeScoreArrayService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@RestController
public class TimeScoreArrayController {

    private final TimeScoreArrayService timeScoreArrayService;

    @PostMapping("/set-time-score-array-data")
    public ResponseEntity<String> setTimeScoreArrayData(@RequestBody TimeScoreArrayRequestDTO requestDTO) {

        timeScoreArrayService.saveTimeScoreArrayData(requestDTO);
        System.out.println("Time-Score Array data saved.");

        return ResponseEntity.ok("Time-Score Array data saved successfully.");
    }

    @GetMapping("/get-all-time-score-array-data")
    public ResponseEntity<List<TimeScoreArrayResponseDTO>> getTimeScoreArrayData() {

        try {
            List<TimeScoreArrayResponseDTO> timeScoreArrayResponseList = timeScoreArrayService.getAllTimeScoreArrayData();
            return ResponseEntity.ok(timeScoreArrayResponseList);
        } catch (Exception e) {
            // 에러 발생시 빈 리스트 반환 또는 예외 처리
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(new ArrayList<>());
        }
    }
}
