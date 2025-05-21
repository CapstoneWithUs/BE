package capstondesign2.backend.showStatistics.controller;

import capstondesign2.backend.showStatistics.dto.StatisticsRequestDTO;
import capstondesign2.backend.baseDTO.BaseResponseDTO;
import capstondesign2.backend.showStatistics.dto.StatisticsResponseDTO;
import capstondesign2.backend.showStatistics.service.StatisticsService;
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


    @GetMapping("/get-all-statistics")
    public ResponseEntity<List<StatisticsResponseDTO>> getAllStatistics() {

        try {
            List<StatisticsResponseDTO> statisticsList = statisticsService.getAllStatistics();
            return ResponseEntity.ok(statisticsList);
        } catch (Exception e) {
            // 에러 발생시 빈 리스트 반환 또는 예외 처리
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(new ArrayList<>());
        }

    }


}
