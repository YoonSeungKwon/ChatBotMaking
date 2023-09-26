package yoon.test.sttTest.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/stt")
public class MainController {

    @Value("${user.client-id}")
    private String CLIENT_ID;
    @Value("${user.secret}")
    private String SECRET;

    @PostMapping("/")
    public ResponseEntity<?> stt(HttpServletRequest request, HttpServletResponse response){
        response.setHeader("X-NCP-APIGW-API-KEY-ID", CLIENT_ID);
        response.setHeader("X-NCP-APIGW-API-KEY", SECRET);
        response.setHeader("Content-Type", "application/octet-stream");


    }

}
