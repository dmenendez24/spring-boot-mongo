package com.sample.mongoImplementation.entities;

import org.springframework.data.annotation.Id;

public class SessionEntity {
    @Id
    private String sessionId;
    private String sessionToken;

    public SessionEntity(String sessionId, String sessionToken) {
        this.sessionId = sessionId;
        this.sessionToken = sessionToken;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public String getSessionToken() {
        return sessionToken;
    }

    public void setSessionToken(String sessionToken) {
        this.sessionToken = sessionToken;
    }
}
