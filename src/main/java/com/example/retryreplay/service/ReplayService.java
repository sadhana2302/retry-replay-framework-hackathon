package com.example.retryreplay.service;

import org.springframework.stereotype.Service;

@Service
public class ReplayService {
    public void replayTransaction(String transactionId) {
        System.out.println("Replaying transaction: " + transactionId);
    }
}