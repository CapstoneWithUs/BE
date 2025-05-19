package capstondesign2.backend.statistics.subject.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class SubjectResponseDTO {
    List<SubjectRequestDTO> subjectList;
}
