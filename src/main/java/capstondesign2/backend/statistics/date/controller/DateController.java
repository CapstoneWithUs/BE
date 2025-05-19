package capstondesign2.backend.statistics.date.controller;

import capstondesign2.backend.statistics.date.dto.DateRequestDTO;
import capstondesign2.backend.statistics.date.dto.DateResponseDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DateController {

    DateResponseDTO dateResponseDTO = new DateResponseDTO();

    @PostMapping("/send-date")
    public void sendDate(@RequestBody DateRequestDTO dateRequestDTO) {
        dateResponseDTO.setDate(dateRequestDTO.getDate());

        System.out.println("날짜: " + dateResponseDTO.getDate());
    }

    @GetMapping("/get-date")
    public DateResponseDTO getDate() {
        return dateResponseDTO;
    }
}
