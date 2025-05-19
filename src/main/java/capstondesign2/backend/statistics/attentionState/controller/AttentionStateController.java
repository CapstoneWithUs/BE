package capstondesign2.backend.statistics.attentionState.controller;

import capstondesign2.backend.statistics.attentionState.dto.AttentionStateRequestDTO;
import capstondesign2.backend.statistics.attentionState.dto.AttentionStateResponseDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AttentionStateController {

    AttentionStateResponseDTO attentionStateResponseDTO = new AttentionStateResponseDTO();

    @PostMapping("/send-attention-state")
    public void sendAttentionState(@RequestBody AttentionStateRequestDTO attentionStateRequestDTO) {

        attentionStateResponseDTO.setAbsenceTimeMs(attentionStateRequestDTO.getAbsenceTimeMs());
        attentionStateResponseDTO.setSleepTimeMs(attentionStateRequestDTO.getSleepTimeMs());
        attentionStateResponseDTO.setGazeAwayTimeMs(attentionStateRequestDTO.getGazeAwayTimeMs());

        System.out.println("집중 상태 시간 입력 완료: " + attentionStateResponseDTO);
    }
}
