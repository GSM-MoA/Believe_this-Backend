package com.example.belivethis.login.service;

import com.example.belivethis.login.data.dto.MemberSignUpRequestDTO;

import java.util.Map;

public interface MemberService {
    public Long signUp(MemberSignUpRequestDTO requestDto) throws Exception;
    public String login(Map<String, String> members);
}
