package org.example.k6stresstestsampleproject.domain;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserAccessLogRepository extends JpaRepository<UserAccessLog, Long> {
}
