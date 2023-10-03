package yoon.test.sttTest.controller;

import lombok.RequiredArgsConstructor;
import org.json.simple.parser.ParseException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import yoon.test.sttTest.service.Palm2Service;
import yoon.test.sttTest.service.SttService;

import java.io.IOException;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/stt")
public class MainController {

    private final SttService sttService;
    private final Palm2Service palm2Service;
    @GetMapping("/")
    public ResponseEntity<?> stt() throws ParseException, IOException {
        String result1 = sttService.stt("C:\\Users\\user\\Desktop\\audioSample.wav");
        String result2 = palm2Service.palm2(result1);
        return ResponseEntity.ok(result1 + ":" + result2);
    }

}
