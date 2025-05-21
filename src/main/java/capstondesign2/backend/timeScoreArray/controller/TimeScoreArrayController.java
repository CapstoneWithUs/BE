package capstondesign2.backend.timeScoreArray.controller;

import capstondesign2.backend.timeScoreArray.dto.TimeScoreArrayRequestDTO;
import capstondesign2.backend.timeScoreArray.service.TimeScoreArrayService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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
}
