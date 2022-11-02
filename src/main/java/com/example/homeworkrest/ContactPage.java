package com.example.homeworkrest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactPage {

    @RequestMapping("/contact")
    public String printContactPageText() {
        return "ITIvanov18@codingburgas.bg";
    }
}
