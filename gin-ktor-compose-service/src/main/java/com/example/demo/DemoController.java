package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class DemoController {

    final PythonService pythonService;

    public DemoController(PythonService pythonService) {
        this.pythonService = pythonService;
    }

    @Autowired
    DiscoveryClient client;

    @GetMapping("/")
    Map<String, String> hello() {
        HashMap<String, String> response = new HashMap<>();
        response.put("message", pythonService.home());
        client.getInstances("demo-python-sidecar").forEach(serviceInstance -> {

        });
        return response;
    }

}
