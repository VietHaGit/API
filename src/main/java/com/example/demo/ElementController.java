package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/elements")
public class ElementController  {

    @GetMapping
    public List<String> getElements(){
        List<String> elements = new ArrayList<>();
        elements.add("A");
        elements.add("B");
        elements.add("C");
        return elements;
//        completed
    }
}
