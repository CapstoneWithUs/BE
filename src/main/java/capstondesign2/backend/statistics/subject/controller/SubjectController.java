package capstondesign2.backend.statistics.subject.controller;

import capstondesign2.backend.statistics.subject.dto.SubjectRequestDTO;
import capstondesign2.backend.statistics.subject.dto.SubjectResponseDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class SubjectController {

    SubjectRequestDTO subjectRequestDTO = new SubjectRequestDTO();
    SubjectResponseDTO subjectResponseDTO = new SubjectResponseDTO();
    List<SubjectRequestDTO> subjectList = new ArrayList<>();

    @PostMapping("/subject/send-subject")
    public void sendSubject(@RequestBody SubjectRequestDTO subjectRequestDTO) {
        subjectRequestDTO.setSubjectName(subjectRequestDTO.getSubjectName());

        subjectList.add(subjectRequestDTO);

        subjectResponseDTO.setSubjectList(subjectList);

        System.out.println("과목 추가 완료: " + subjectResponseDTO.getSubjectList());
    }

    @GetMapping("/subject/get-subject")
    public SubjectResponseDTO getSubject() {
        return subjectResponseDTO;
    }
}
