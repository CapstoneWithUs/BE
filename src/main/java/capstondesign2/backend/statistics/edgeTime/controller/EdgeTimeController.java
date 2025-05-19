package capstondesign2.backend.statistics.edgeTime.controller;

import capstondesign2.backend.statistics.edgeTime.dto.EdgeTimeRequestDTO;
import capstondesign2.backend.statistics.edgeTime.dto.EdgeTimeResponseDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EdgeTimeController {

    EdgeTimeResponseDTO edgeTimeResponseDTO = new EdgeTimeResponseDTO();

    @PostMapping("/send-edgeTime")
    public void sendEdgeTime(@RequestBody EdgeTimeRequestDTO edgeTimeRequestDTO) {

        edgeTimeResponseDTO.setStartTime(edgeTimeRequestDTO.getStartTime());
        edgeTimeResponseDTO.setEndTime(edgeTimeRequestDTO.getEndTime());

        System.out.println("시작시간: " + edgeTimeResponseDTO.getStartTime() + ", 종료 시간: " + edgeTimeResponseDTO.getEndTime());
    }

    @GetMapping("/get-edgeTime")
    public EdgeTimeResponseDTO getEdgeTime() {
        return edgeTimeResponseDTO;
    }
}
