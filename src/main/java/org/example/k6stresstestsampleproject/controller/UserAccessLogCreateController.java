package org.example.k6stresstestsampleproject.controller;

import lombok.RequiredArgsConstructor;
import org.example.k6stresstestsampleproject.usecase.UserAccessLogCreateUseCase;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RequestMapping(value = "/api/v1/user-access-logs")
@RestController
public class UserAccessLogCreateController {

    private final UserAccessLogCreateUseCase userAccessLogCreateUseCase;

    @PostMapping
    public ResponseEntity<Void> createUserAccessLog(
        @RequestBody UserAccessLogCreateRequestDto request
    ) {
        userAccessLogCreateUseCase.create(request.userId());
        return ResponseEntity.noContent().build();
    }

}
