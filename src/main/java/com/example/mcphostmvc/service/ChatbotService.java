package com.example.mcphostmvc.service;

import lombok.RequiredArgsConstructor;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class ChatbotService {

    private final ChatClient chatClient;

//    public Mono<String> chat(String question) {
//        return chatClient
//                .prompt()
//                .user(question)
//                .stream()
//                .content()
//                .collectList()
//                .map(chunks -> String.join("", chunks));
//    }

//    public String chat(String question) {
//        return chatClient.prompt()
//                .user(question)
//                .stream()
//                .content()
//                .collectList()
//                .map(chunks -> String.join("", chunks))
//                .block();
//    }

    public String chat(String question) {
        // .call()을 사용하면 내부적으로 한 번에 요청·응답을 처리
        return chatClient.prompt()
                .user(question)
                .call()
                .content();
    }


}
