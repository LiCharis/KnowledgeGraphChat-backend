package com.my.knowledgegraphchatbackend.model.dto;

import lombok.Data;

@Data
public class ChatUpdateRequest {
    private String id;
    /**
     * 标题
     */
    private String title;
}
