package com.example.demo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "demo-python-sidecar")
public interface PythonService {

    @GetMapping("/")
    String home();

}
