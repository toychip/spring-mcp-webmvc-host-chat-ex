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
}
