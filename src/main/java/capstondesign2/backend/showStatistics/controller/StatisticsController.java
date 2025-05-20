package capstondesign2.backend.showStatistics.controller;

import capstondesign2.backend.showStatistics.dto.StatisticsRequestDTO;
import capstondesign2.backend.showStatistics.service.StatisticsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class StatisticsController {

    private final StatisticsService statisticsService;

    @PostMapping("/set-statistics")
    public void setStatistics(@RequestBody StatisticsRequestDTO requestDTO) {

        statisticsService.saveStatistics(requestDTO);
        System.out.println("Statistics data saved.");
    }
}
