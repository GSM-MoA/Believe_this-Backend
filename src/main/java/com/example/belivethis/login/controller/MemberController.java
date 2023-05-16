package com.example.belivethis.login.controller;

import com.example.belivethis.login.data.dto.MemberSignUpRequestDTO;
import com.example.belivethis.login.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Map;

@RequiredArgsConstructor
@RequestMapping("/auth")
@RestController
public class MemberController {
    private final MemberService memberService;

    @PostMapping("/signup")
    @ResponseStatus(HttpStatus.OK)
    public Long join(@Valid @RequestBody MemberSignUpRequestDTO request) throws Exception{
        return memberService.signUp(request);
    }

    @PostMapping("/signin")
    public String login(@RequestBody Map<String, String> member) {
        return memberService.login(member);
    }

}
