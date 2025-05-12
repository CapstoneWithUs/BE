package capstondesign2.backend.calculateTime.service;

import org.springframework.stereotype.Service;

@Service
public interface CalculateTimeService {
    public String calculateTime(String startDate, String endDate);
}
