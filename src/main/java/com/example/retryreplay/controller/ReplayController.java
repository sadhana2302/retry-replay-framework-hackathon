package com.example.retryreplay.controller;

import com.example.retryreplay.service.ReplayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/replay")
public class ReplayController {

    @Autowired
    private ReplayService replayService;

    @PostMapping("/manual")
    public String manualReplay(@RequestParam String transactionId) {
        replayService.replayTransaction(transactionId);
        return "redirect:/";
    }
}