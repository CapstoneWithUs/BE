package capstondesign2.backend.session.controller;

import capstondesign2.backend.session.dto.scoreDTO.PostSessionDataDTO;
import capstondesign2.backend.session.dto.SessionData;
import capstondesign2.backend.session.service.SessionDataService;
import capstondesign2.backend.session.service.SessionDataServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SessionDataController {

    SessionDataService sessionDataService = new SessionDataServiceImpl();

    // 공부 시간(ms), FocusScore 입력받기 및 focusGrade 계산
    @PostMapping("/session/set-study-info")
    public ResponseEntity<SessionData> setStudyInfo(@RequestBody PostSessionDataDTO postSessionDataDTO) {

        // null 체크 추가
        if (postSessionDataDTO.getStudyTimeMs() == null) {
            postSessionDataDTO.setStudyTimeMs(0L);
        }

        if (postSessionDataDTO.getFocusScore() == null) {
            postSessionDataDTO.setFocusScore(0.0);
        }

        SessionData sessionData = new SessionData();
        sessionData.setStudyTimeMs(postSessionDataDTO.getStudyTimeMs());
        sessionData.setSleepTimeMs(postSessionDataDTO.getSleepTimeMs());
        sessionData.setFocusScore(postSessionDataDTO.getFocusScore());
        sessionData.setFocusScoreList(postSessionDataDTO.getFocusScoreHistory());

        sessionDataService.setFocusGrade(sessionData , postSessionDataDTO.getFocusScore());

        return ResponseEntity.ok(sessionData);  // http 응답
    }


}
