package com.chatgpt.controller;

import com.chatgpt.pojo.Result;
import com.chatgpt.service.MessageService;
import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@Slf4j
@RestController
@RequestMapping("chat")
@CrossOrigin(origins = "*")
public class MessageController {

    @Autowired
    private MessageService messageService;
    @GetMapping
    private Result get(@RequestParam(defaultValue = "how are you?") String q) throws IOException {
        log.info("query gpt answer for question:{}",q);
        String ans = messageService.chat(q);
        log.info("the gpt answer is:{}",ans);
        return Result.success(ans);
    }

}
