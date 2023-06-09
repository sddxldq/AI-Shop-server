package com.chatgpt.service.impl;

import com.chatgpt.repository.CustomChatGPT;
import com.chatgpt.service.MessageService;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class MessageServiceImpl implements MessageService {
    @Autowired
    CustomChatGPT customChatGpt;
    @Override
    public String chat(String q) throws IOException {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        String answer = customChatGpt.getAnswer(httpClient, q);
        httpClient.close();
        return answer;
    }
}
