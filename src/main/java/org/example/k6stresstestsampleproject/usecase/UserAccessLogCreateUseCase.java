package org.example.k6stresstestsampleproject.usecase;

import lombok.RequiredArgsConstructor;
import org.example.k6stresstestsampleproject.domain.UserAccessLog;
import org.example.k6stresstestsampleproject.domain.UserAccessLogRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class UserAccessLogCreateUseCase {

    private final UserAccessLogRepository userAccessLogRepository;

    @Transactional
    public void create(Long userId) {
        try {
            Thread.sleep(40);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        userAccessLogRepository.save(UserAccessLog.of(userId));
    }
}
