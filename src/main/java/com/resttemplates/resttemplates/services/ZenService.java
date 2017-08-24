package com.resttemplates.resttemplates.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

/**
 * Created by localadmin on 8/24/17.
 */

@Service
public class ZenService {

    private final RestTemplate restTemplate;

    @Autowired
    public ZenService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String getMessage() {
        return this.restTemplate.getForObject( // <------ #3
                "https://api.github.com/zen",
                String.class
        );
    }
}
