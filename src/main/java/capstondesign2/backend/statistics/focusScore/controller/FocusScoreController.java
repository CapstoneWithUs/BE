package capstondesign2.backend.statistics.focusScore.controller;

import capstondesign2.backend.statistics.focusScore.dto.FocusScoreRequestDTO;
import capstondesign2.backend.statistics.focusScore.dto.FocusScoreResponseDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FocusScoreController {

    FocusScoreResponseDTO focusScoreResponseDTO = new FocusScoreResponseDTO();

    @PostMapping("/focus-score/send-focus-score")
    public void sendFocusScore(@RequestBody FocusScoreRequestDTO focusScoreRequestDTO) {
        focusScoreResponseDTO.setFocusScore(focusScoreRequestDTO.getFocusScore());

        System.out.println("Focus Score 입력 완료: " + focusScoreResponseDTO.getFocusScore());
    }

    @GetMapping("/focus-score/get-focus-score")
    public FocusScoreResponseDTO getFocusScore() {
        return focusScoreResponseDTO;
    }
}
