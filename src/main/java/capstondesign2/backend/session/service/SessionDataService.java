package capstondesign2.backend.session.service;

import capstondesign2.backend.session.dto.SessionData;
import org.springframework.stereotype.Service;

@Service
public interface SessionDataService {

    void setFocusGrade(SessionData sessionData);

}
