package com.megait.mailTest.dto;

import lombok.*;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MailDto {
    private String address;
    private String title;
    private String emailCheckToken;

    // repository를 거치지 않고 DB를 수정해야하는 경우.. @Transactional를 쓸 것!
    public String generateEmailCheckToken() {
        emailCheckToken = UUID.randomUUID().toString();
        return emailCheckToken;
    }
}