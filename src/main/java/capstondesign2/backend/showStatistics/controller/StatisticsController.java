package capstondesign2.backend.showStatistics.controller;

import capstondesign2.backend.showStatistics.dto.StatisticsRequestDTO;
import capstondesign2.backend.baseDTO.BaseResponseDTO;
import capstondesign2.backend.showStatistics.service.StatisticsService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class StatisticsController {

    private final StatisticsService statisticsService;

    @PostMapping("/set-statistics")
    public ResponseEntity<BaseResponseDTO<Void>> setStatistics(@RequestBody StatisticsRequestDTO requestDTO) {

        try {
            statisticsService.saveStatistics(requestDTO);
            System.out.println("Statistics data saved.");

            return ResponseEntity.ok(
                    BaseResponseDTO.success("Statistics data saved successfully")
            );
        } catch (Exception e) {
            return ResponseEntity.badRequest()
                    .body(BaseResponseDTO.fail("Failed to save statistics: " + e.getMessage()));
        }

    }
}
