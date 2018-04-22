package org.springframework.example.restfulwebservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.example.restfulwebservice.model.Greeting;
import org.springframework.web.client.RestTemplate;

public class RestClient {

    private static final Logger log = LoggerFactory.getLogger(RestClient.class);

    public static void main(String[] args) {
        RestTemplate restTemplate = new RestTemplate();
        Greeting quote = restTemplate.getForObject("http://localhost:8080/api/greeting", Greeting.class);
        log.info(quote.toString());
    }

}
