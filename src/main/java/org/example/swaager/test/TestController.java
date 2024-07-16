package org.example.swaager.test;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Tag(name = "test controller")
@RequestMapping
public class TestController {

    @Operation(summary = "this api ddis awesome")
    @RequestMapping(method = RequestMethod.GET, value = "/ex01")
    public ResponseEntity<String> ex01(String arg01, String arg02){
        System.out.println(arg01);
        System.out.println(arg02);
        return ResponseEntity.ok("ex01");
    }

    @Operation(summary = "testing!")
    @RequestMapping(method = RequestMethod.GET, value = "/yongho")
    public ResponseEntity<String> ex02(String arg01, String arg02){
        System.out.println(arg01);
        System.out.println(arg02);
        return ResponseEntity.ok("ex02");
    }
}
