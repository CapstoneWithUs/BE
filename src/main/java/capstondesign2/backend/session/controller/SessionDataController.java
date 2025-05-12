package capstondesign2.backend.session.controller;

import capstondesign2.backend.session.dto.SessionData;
import capstondesign2.backend.session.service.SessionDataService;
import capstondesign2.backend.session.service.SessionDataServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SessionDataController {

    SessionDataService sessionDataService = new SessionDataServiceImpl();

    // 공부 시간(ms), FocusScore 입력받기 및 focusGrade 계산
    @PostMapping("/session/set-study-info")
    public SessionData setStudyInfo(SessionData sessionData) {

        sessionData.setStudyTimeMs(sessionData.getStudyTimeMs());  // 공부 시간(ms)
        sessionData.setFocusScore(sessionData.getFocusScore());  // FocusScore

        sessionDataService.setFocusGrade(sessionData);  // focusGrade 계산

        return sessionData;
    }


}
