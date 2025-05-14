package capstondesign2.backend.session.service;

import capstondesign2.backend.session.FocusGrade;
import capstondesign2.backend.session.dto.SessionData;

public class SessionDataServiceImpl implements SessionDataService {

    @Override
    public void setFocusGrade(SessionData sessionData, Double focusScore) {
        if (focusScore >= 90) {
            sessionData.setFocusGrade(FocusGrade.A);
        } else if (focusScore >= 80) {
            sessionData.setFocusGrade(FocusGrade.B);
        } else if (focusScore >= 70) {
            sessionData.setFocusGrade(FocusGrade.C);
        } else{
            sessionData.setFocusGrade(FocusGrade.D);
        }
    }

}
