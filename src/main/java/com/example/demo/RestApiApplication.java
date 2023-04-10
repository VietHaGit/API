package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class RestApiApplication {
    @RequestMapping(value = "/" , method = RequestMethod.GET)
    public ResponseEntity<String> home1(){
        return  new ResponseEntity<>("Home ", HttpStatus.OK);
    }
    @RequestMapping("/list")
    public List<String> home(){
        List<String> list = new ArrayList<>();
        list.addAll( Arrays.asList("A","B","C"));
        return  list;
    }

}
