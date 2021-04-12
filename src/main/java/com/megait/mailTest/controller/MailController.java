package com.megait.mailTest.controller;

import com.megait.mailTest.dto.MailDto;
import com.megait.mailTest.service.MailService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@AllArgsConstructor
public class MailController {
    private final MailService mailService;

    @GetMapping("/")
    public String dispMail() {
        return "index";
    }

    @PostMapping("/index")
    public String goMail(@RequestParam String address, @RequestParam String title, @RequestParam String emailCheckToken){
        MailDto mailDto = new MailDto(address, title, emailCheckToken);



        mailService.mailSend(mailDto);
        return "success";

    }




}
