package capstondesign2.backend.session.dto.scoreDTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
public class PostSessionDataDTO {
    private Long studyTimeMs;
    private Long sleepTimeMs;
    private Double focusScore;
    private List<FocusScorePointDTO> focusScoreHistory;
}
