package com.example.ussdWebService.data;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;
//storing session in redis cache

@Data
@RedisHash(value = "sessions", timeToLive = 180) //can be stored on redis hash
public class UssdSession implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    private String id;
    private String sessionId;
    private String serviceCode;
    private String phoneNumber;
    private String text;
    private String previousMenuLevel;
    private String currentMenuLevel;
}
