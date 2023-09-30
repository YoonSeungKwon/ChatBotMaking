package yoon.test.sttTest.controller;

import lombok.RequiredArgsConstructor;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import yoon.test.sttTest.service.Palm2Service;
import yoon.test.sttTest.service.SttService;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/stt")
public class MainController {

    private final SttService sttService;
    private final Palm2Service palm2Service;

    @GetMapping("/")
    public ResponseEntity<?> stt() throws ParseException, IOException {
        String result = sttService.stt("src/main/resources/static/test.mp3");
        String output = palm2Service.palm2(result);
        return ResponseEntity.ok(output);
    }

}
