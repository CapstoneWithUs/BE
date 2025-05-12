package capstondesign2.backend.calculateTime.controller;

import capstondesign2.backend.calculateTime.dto.FocusGrade;
import capstondesign2.backend.calculateTime.dto.response.TimeResponseDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class CalculateTimeController {

    // FE에서 시간 전송
    @PostMapping("/calculateTime/calculateGrade")
    public FocusGrade calculateGrade() {



        return FocusGrade.A;
    }



}
