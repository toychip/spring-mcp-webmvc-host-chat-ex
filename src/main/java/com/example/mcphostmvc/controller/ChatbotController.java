package com.example.mcphostmvc.controller;

import com.example.mcphostmvc.service.ChatbotService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ChatbotController {

    private final ChatbotService chatbotService;

    @PostMapping("/chat")
    public ResponseEntity<ChatResponse> chat(@RequestBody ChatRequest chatRequest) {
        System.out.println("chatRequest.question = " + chatRequest.question());
        return ResponseEntity.ok(new ChatResponse(chatbotService.chat(chatRequest.question())));
    }


    @PostMapping("/getFutureWeather")
    public ResponseEntity<ChatResponse> getFutureWeather(@RequestBody ChatRequest chatRequest) {
        System.out.println("getFutureWeather.question = " + chatRequest.question());
        return ResponseEntity.ok(new ChatResponse(chatbotService.chat(chatRequest.question())));
    }


    @PostMapping("/getFlightSearch")
    public ResponseEntity<ChatResponse> getFlightSearch(@RequestBody ChatRequest chatRequest) {
        System.out.println("getFlightSearch.question = " + chatRequest.question());
        return ResponseEntity.ok(new ChatResponse(chatbotService.chat(chatRequest.question())));
    }
}
