package com.ericnorrwing.wsj_lek_3_webflux.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class GreetingController {

    //Mono<> || flux<>
    //Mono returnerar enkla grejer (object, strings, ints etc)
    //Flux returnerar en stream
    @GetMapping("/greeting")
    public Mono<String> greetUser(){
        return Mono.just("<h1> Hello <h1/>");
    }
}
