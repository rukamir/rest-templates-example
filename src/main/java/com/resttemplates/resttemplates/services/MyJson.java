package com.resttemplates.resttemplates.services;

import com.resttemplates.resttemplates.Models.MJResponseModel;
import com.resttemplates.resttemplates.Models.PersonModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@Service
public class MyJson {
    private final RestTemplate restTemplate;

    @Autowired
    public MyJson(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public MJResponseModel saveJSON(PersonModel person) {
        URI uri = UriComponentsBuilder
                .fromHttpUrl("https://api.myjson.com/bins")
                .buildAndExpand()
                .toUri();

        RequestEntity<?> request = RequestEntity
                .post(uri)
                .body(person);

        ResponseEntity<MJResponseModel> response = this.restTemplate.exchange(request, MJResponseModel.class);

        return response.getBody();
    }
}
