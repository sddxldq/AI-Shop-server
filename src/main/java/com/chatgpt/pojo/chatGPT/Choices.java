package com.chatgpt.pojo.chatGPT;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Choices {
    ChatGPTMessage message;
    String finish_reason;
    Integer index;
}
