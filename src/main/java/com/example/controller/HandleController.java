package com.example.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import net.sf.json.JSONObject;

@RestController
public class HandleController {
    // private static final Logger LOGGER = LoggerFactory.getLogger(WebhookService.class);
    @RequestMapping("/receiver")
    public String Handler(@RequestBody JSONObject requestBody) {
        System.out.println("Data: " + requestBody);
        return "sucess";
    }
}
