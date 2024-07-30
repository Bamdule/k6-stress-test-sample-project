package org.example.k6stresstestsampleproject.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "user_Access_log")
@Entity
public class UserAccessLog {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    @Column(nullable = false)
    private Long userId;

    @Column(name = "create_at", nullable = false)
    private LocalDateTime createAt;

    public UserAccessLog(Long id, Long userId, LocalDateTime createAt) {
        this.id = id;
        this.userId = userId;
        this.createAt = createAt;
    }

    public static UserAccessLog of(Long userId) {
        return new UserAccessLog(null, userId, LocalDateTime.now());
    }
}
