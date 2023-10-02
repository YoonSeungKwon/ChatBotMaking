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

    @GetMapping("/")
    public ResponseEntity<?> stt() throws ParseException, IOException {
        String result = sttService.stt("src/main/resources/static/test.mp3");
        return ResponseEntity.ok(result);
    }

}
